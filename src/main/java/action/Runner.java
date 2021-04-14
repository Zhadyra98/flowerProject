package action;

import model.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Runner {
    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Flower Shop");
        if (new File("bouqets").exists()) {
            Database.desBouqets();
        }
        while (true) {
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
                        for (int i = 0; i < Bouqet.initializeTheDecorChoiceVector().size(); i++) {
                            System.out.print("[");
                            System.out.print(i + 1);
                            System.out.println("] " + Bouqet.initializeTheDecorChoiceVector().get(i).getClass().getSimpleName());
                        }
                        choice = in.nextInt();
                        System.out.println(Bouqet.initializeTheDecorChoiceVector().get(choice - 1).getClass().getSimpleName() + " is added");
                        tmpBouqet.addDecorToBouqet((Decor) Bouqet.initializeTheDecorChoiceVector().get(choice - 1));
                        System.out.println(tmpBouqet.toString());
                    } else if (choice == 3) {
                        System.out.println("Price of bouqet = " + tmpBouqet.getTotalPrice() + ", weight of Bouqet = " + tmpBouqet.getTotalWeight());
                        System.out.println("Will you buy it ? [yes]/[no]");
                        String strChoice = in.next();
                        if (strChoice.equals("yes")) {
                            System.out.println("Thank you for choosing us");
                            break;
                        } else {
                            System.out.println("Good-Bye");
                            Database.allBouqets.add(tmpBouqet);
                            break;
                        }
                    }
                }
            } else if (choice == 2) {
                System.out.println("Select number of bouqet to Buy or [0] to quit");
                for (int i = 0; i < Database.allBouqets.size(); i++) {
                    System.out.print("[" + (i + 1));
                    System.out.println("]" + Database.allBouqets.get(i).toString());
                }
                choice = in.nextInt();
                if (choice != 0) {
                    System.out.println(Database.allBouqets.get(choice - 1).toString());
                    System.out.println("Price = " + Database.allBouqets.get(choice - 1).getTotalPrice() + ", weight= " + Database.allBouqets.get(choice - 1).getTotalWeight());
                    System.out.println("Will you buy it ? [yes]/[no]");
                    String strChoice = in.next();
                    if (strChoice.equals("yes")) {
                        System.out.println("Thank you for choosing us");
                        Database.allBouqets.remove(Database.allBouqets.get(choice - 1));
                    }
                }
            } else if (choice == 3) {
                System.out.println("Good-Bye");
                Database.serBouqets();
                break;
            }
        }

    }
}
