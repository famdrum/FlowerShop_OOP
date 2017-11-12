package com.FlowerShop_OOP.Helpers;

import com.FlowerShop_OOP.Entity.Boquet;
import com.FlowerShop_OOP.Entity.Plant;
import com.FlowerShop_OOP.Entity.Shop;
import com.FlowerShop_OOP.Main.Main;
import com.FlowerShop_OOP.Specification.SimpleSpecificaton;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Victor on 11.11.2017.
 */
public class Worker {


    public static void work(Shop shop) {
        String work="y";
        System.out.println("You have such functions\n 1)Add Plant\n2)RemovePlant\n3)Add Boquet\n4)Remove Boquet\n Choose what you want to do");
        int choose;

        while (work.equals("y")) {
            choose = Main.scanner.nextInt();

            switch (choose) {
                case 1:{
                    addNewPlant(shop);
                    break;
                }
                case 2:{
                    deleteFlower(shop);
                    break;
                }
                case 3:{
                    addNewBuquet(shop);
                    break;
                }
                case 4:{
                    deleteBuquet(shop);
                    break;
                }
                default:{
                    System.out.println("Chose correct option");
                    continue;
                }
            }
            Main.scanner.nextLine();
            System.out.println("Do you want to do something else?\ny-For yes, anything else for no");
            work=Main.scanner.nextLine();
        }
    }

    public static boolean addNewPlant(Shop shop) {
        try {
            Main.scanner.nextLine();
            System.out.println("Enter name");
            String name = Main.scanner.nextLine();
            System.out.println("Enter price");
            int price = Main.scanner.nextInt();
            Main.scanner.nextLine();
            System.out.println("Enter smell");
            String smell = Main.scanner.nextLine();
            System.out.println("Enter lenght of stem");
            int lenght = Main.scanner.nextInt();
            Main.scanner.nextLine();
            System.out.println("Country of origin");
            String country = Main.scanner.nextLine();
            SimpleSpecificaton simpleSpecificaton = new SimpleSpecificaton(price, smell, lenght, new Date(), country);
            Plant plant = new Plant(name, simpleSpecificaton);
            shop.getAllPlants().add(plant);
        } catch (Exception e){
            return  false;
        }
        return true;


    }

    public static boolean addNewBuquet(Shop shop) {

        try {
            Boquet boquet = new Boquet();
            shop.showAllFlowers();
            System.out.println("Choose flowers to add\n For example 1234 - for adding flowers 1,2,3,4\n If you want to add one flower more than 1 time" +
                    "print ints number as many times as you want");

            int flowers = Main.scanner.nextInt();

            while (flowers != 0) {

                boquet.addFlower(shop.getAllPlants().get((flowers % 10) - 1));
                flowers = flowers / 10;

            }
            System.out.println("Your boquet is " + boquet.toString());
            shop.getAllBuqqets().add(boquet);
            Main.scanner.nextLine();
            return true;
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong option");
            return false;
        }


    }

    public static boolean deleteBuquet(Shop shop) {
        try {
            shop.showAllBoquets();
            System.out.println("Choose boquet to delete");
            int choose = Main.scanner.nextInt();
            Main.scanner.nextLine();
            shop.getAllBuqqets().remove(choose - 1);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;

    }

    public static boolean deleteFlower(Shop shop) {
        try {


            shop.showAllFlowers();
            System.out.println("Choose plant to delete");
            int choose = Main.scanner.nextInt();

            for (int i = 0; i < shop.getAllBuqqets().size(); i++) {
                if (shop.getAllBuqqets().get(i).getPlants().contains(shop.getAllPlants().get(choose - 1))) {
                    shop.getAllBuqqets().get(i).removeFlower(shop.getAllPlants().get(choose - 1));
                }
            }
            shop.getAllPlants().remove(choose - 1);
        } catch (Exception e){
            return false;
        }
        return true;

    }
}
