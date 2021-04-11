package action;

import enums.Color;
import enums.RoseType;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        List<CreatingBouqet> allBouqets = new ArrayList<>();
        Rose whiteRose = new Rose(250, 14, 100, Color.WHITE, RoseType.GOLAND, 7);
        Rose pinkRose = new Rose(260, 15, 100, Color.PINK, RoseType.BEACH, 8);
        Rose blueRose = new Rose(270, 15, 100, Color.BLUE, RoseType.SWEET, 8);
        Tulip redTulip = new Tulip(400, 10, 150, Color.RED, 5, false);
        Tulip yellowTulip = new Tulip(500, 11, 160, Color.YELLOW, 6, true);
        Tulip pinkTulip = new Tulip(400, 10, 150, Color.PINK, 5, false);
        Cover coverWhite = new Cover(250, 20, 20, Color.WHITE);
        Cover coverPink = new Cover(250, 20, 20, Color.PINK);
        Cover coverBlue = new Cover(250, 20, 20, Color.BLUE);
        ExtraPetal petal = new ExtraPetal(200, 10, 140);
        List<Object> flowersForSelect = new ArrayList<>();
        flowersForSelect.add(whiteRose);
        flowersForSelect.add(pinkRose);
        flowersForSelect.add(blueRose);
        flowersForSelect.add(redTulip);
        flowersForSelect.add(yellowTulip);
        flowersForSelect.add(pinkTulip);
        List<Object> extraItemsForSelect = new ArrayList<>();
        extraItemsForSelect.add(coverWhite);
        extraItemsForSelect.add(coverPink);
        extraItemsForSelect.add(coverBlue);
        extraItemsForSelect.add(petal);
        CreatingBouqet bouqet1 = new CreatingBouqet();
        CreatingBouqet bouqet2 = new CreatingBouqet();
        CreatingBouqet bouqet3 = new CreatingBouqet();
        CreatingBouqet bouqet4 = new CreatingBouqet();
        bouqet1.addFlowerToBouqet(whiteRose, 15);
        bouqet1.addCover(coverWhite);
        bouqet1.addPetal(petal);
        bouqet2.addFlowerToBouqet(pinkRose, 7);
        bouqet3.addFlowerToBouqet(redTulip, 9);
        bouqet4.addFlowerToBouqet(yellowTulip, 11);
        allBouqets.add(bouqet1);
        allBouqets.add(bouqet2);
        allBouqets.add(bouqet3);
        allBouqets.add(bouqet4);
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to FlowerShop !!!");
        while (true) {
            CreatingBouqet tmpBouqet = new CreatingBouqet();
            System.out.println("Select what do yo want ...");
            System.out.println("[1] See existing Flower Bouqets");
            System.out.println("[2] Collect you own Flower Bouqet");
            System.out.println("[3] Exit Flower Shop");
            String choice = in.next();
            if (choice.equals("1")) {
                System.out.println("Currently Existing Bouqets:");
                for (int i = 1; i <= allBouqets.size(); i++) {
                    System.out.print("Select [" + i + "]");
                    System.out.println(allBouqets.get(i - 1).toString());
                }
                int allBougetSize = allBouqets.size();
                int choiceNum = allBougetSize + 1;
                System.out.println("Select [" + choiceNum + "] to create your own");
                Integer flowerChoice = in.nextInt();
                if (flowerChoice <= allBougetSize) {
                    System.out.println("You choice is ");
                    System.out.println(allBouqets.get(flowerChoice - 1).toString());
                    System.out.println("Will you buy it? [Yes/No]");
                    String buyChoice = in.next();
                    if (buyChoice.equals("Yes")) {
                        allBouqets.remove(flowerChoice - 1);
                        System.out.println("The price of the Bouqet is " + allBouqets.get(flowerChoice - 1).getTotalPrice() + " tenge");
                        Thread.sleep(3000);
                        System.out.println("Thank you for choosing us");
                        Thread.sleep(3000);

                    } else if (buyChoice.equals("No")) {
                        System.out.println("Try to collect your own ");
                    }
                }
            } else if (choice.equals("2")) {
                while (true) {
                    System.out.println("[1] Select flowers");
                    System.out.println("[2] Select extra items");
                    System.out.println("[3] Ready to Buy");
                    choice = in.next();
                    Integer itemCount = 0;
                    Integer itemNumber = 0;
                    if (choice.equals("1")) {
                        for (int i = 1; i <= flowersForSelect.size(); i++) {
                            System.out.print("[" + i + "] Select");
                            System.out.println(flowersForSelect.get(i - 1).toString());
                        }
                        itemNumber = in.nextInt();
                        System.out.println("Enter how much you want to get ...");
                        itemCount = in.nextInt();
                        if (itemNumber == 1) {
                            tmpBouqet.addFlowerToBouqet(whiteRose, itemCount);
                        } else if (itemNumber == 2) tmpBouqet.addFlowerToBouqet(pinkRose, itemCount);
                        else if (itemNumber == 3) tmpBouqet.addFlowerToBouqet(blueRose, itemCount);
                        else if (itemNumber == 4) tmpBouqet.addFlowerToBouqet(redTulip, itemCount);
                        else if (itemNumber == 5) tmpBouqet.addFlowerToBouqet(yellowTulip, itemCount);
                        else if (itemNumber == 6) tmpBouqet.addFlowerToBouqet(pinkTulip, itemCount);
                    } else if (choice.equals("2")) {
                        for (int i = 1; i <= extraItemsForSelect.size(); i++) {
                            System.out.print("[" + i + "] Select");
                            System.out.println(extraItemsForSelect.get(i - 1).toString());
                        }
                        itemNumber = in.nextInt();
                        if (itemNumber == 1) tmpBouqet.addCover(coverWhite);
                        else if (itemNumber == 2) tmpBouqet.addCover(coverPink);
                        else if (itemNumber == 3) tmpBouqet.addCover(coverBlue);
                        else if (itemNumber == 4) tmpBouqet.addPetal(petal);
                    } else {
                        System.out.println("You collected bouqet as following");
                        System.out.println(tmpBouqet.toString());
                        System.out.println("The Price of the Bouqet is" + tmpBouqet.getTotalPrice() + " tenge");
                        Thread.sleep(3000);
                        System.out.println("Thank you for choosing us");
                        Thread.sleep(3000);
                        break;
                    }
                }
            } else if (choice.equals("3")) {
                System.out.println("Thank you for being with us");
                break;
            } else {
                System.out.println("Enter correct option");
            }
        }
    }
}
