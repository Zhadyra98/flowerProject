package action;

import model.*;

import java.util.Scanner;
import java.util.Vector;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        Vector<Bouqet> allBouqets = new Vector<>();
        while (true) {
            System.out.println("Welcome to the Flower Shop");
            System.out.println("[1] Select to create bouqet \n[2] See existing Bouqets \n[3] Select to Exit");
            int choice = in.nextInt();
            int amount;
            if (choice == 1) {
                System.out.println("Enter the name of the Bouqet, that you want to collect");
                String nameOfBouqet = in.next();
                Bouqet tmpBouqet = new Bouqet(nameOfBouqet);
                while (true) {
                    System.out.println("[1] Choose flowers\n[2] Choose decors\n[3] Ready to buy");
                    choice = in.nextInt();
                    if (choice == 1) {
                        for (int i = 0; i < Bouqet.initializeTheFlowerChoiceVector().size(); i++) {
                            System.out.print("[");
                            System.out.print(i + 1);
                            System.out.println("] " + Bouqet.initializeTheFlowerChoiceVector().get(i).getClass().getSimpleName());
                        }
                        choice = in.nextInt();
                        System.out.println("You choice is " + Bouqet.initializeTheFlowerChoiceVector().get(choice - 1).getClass().getSimpleName());
                        System.out.println("Enter how many you want to get?");
                        amount = in.nextInt();
                        tmpBouqet.addFlowerToBouqet((FlowerBase) Bouqet.initializeTheFlowerChoiceVector().get(choice - 1), amount);
                        System.out.println(tmpBouqet.toString());
                    } else if (choice == 2) {
                        for (int i = 0; i < Bouqet.initializeTheFlowerChoiceVector().size(); i++) {
                            System.out.print("[");
                            System.out.print(i + 1);
                            System.out.println("] " + Bouqet.initializeTheFlowerChoiceVector().get(i).getClass().getSimpleName());
                        }
                        choice = in.nextInt();
                        System.out.println("You choice is " + Bouqet.initializeTheFlowerChoiceVector().get(choice - 1).getClass().getSimpleName());
                        System.out.println("Enter how many you want to get?");
                        amount = in.nextInt();
                        tmpBouqet.addFlowerToBouqet((FlowerBase) Bouqet.initializeTheFlowerChoiceVector().get(choice - 1), amount);
                        System.out.println(tmpBouqet.toString());
                    } else if (choice == 3) {
                        System.out.println("Show Price of bouqet");
                        System.out.println("Will you buy it ? [yes]/[no]");
                        String strChoice = in.next();
                        if (strChoice.equals("yes")) {
                            System.out.println("Thank you for choosing us");
                            break;
                        } else {
                            System.out.println("Good-Bye");
                            allBouqets.add(tmpBouqet);
                            break;
                        }
                    }
                }
            } else if (choice == 2) {
                System.out.println(allBouqets);
            } else if (choice == 3) {
                System.out.println("Good-Bye");
                break;
            }
        }

    }
}
