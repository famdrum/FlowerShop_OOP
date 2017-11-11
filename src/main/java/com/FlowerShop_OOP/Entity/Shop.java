package com.FlowerShop_OOP.Entity;


import com.FlowerShop_OOP.Comparators.CompareByFreshness;
import com.FlowerShop_OOP.Comparators.CompareBylength;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    private List<Plant> allPlants;
    private List<Boquet> allBuqqets;
    public Shop(){
        allPlants = new ArrayList<Plant>();
        allBuqqets = new ArrayList<Boquet>();
        fillShopWithGoods();


    }

    public void pay_online(Customer cst, Boquet boquet) {
        System.out.println("Select payment method: 1 PayPal, 2 credit/debit card");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 1) {
            System.out.println("Signing in your PayPal account..");
            if (cst.getBalance() > boquet.getPrice()) {
                cst.charge(boquet.getPrice());
            } else {
                System.out.println("Sorry, you don`t have enough money");
                return;
            }
        } else if (num == 2) {
            System.out.println("Entering your pin number...");
            if (cst.getBalance() > boquet.getPrice()) {
                cst.charge(boquet.getPrice());
            } else {
                System.out.println("Sorry, you don`t have enough money");
                return;
            }
        }
        System.out.println("Thanks for your purchase");
    }

    public void delivery(Customer cst, Boquet boquet) {
        int ukr_p = 25;
        int new_p = 40;
        System.out.println("Select shipping method: 1 Нова пошта, 2 Укрпошта");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 1) {
            if (cst.getBalance() > new_p) {
                cst.charge(new_p);
            } else {
                System.out.println("Sorry, you don`t have enough money");
                return;
            }
        } else if (num == 2) {
            if (cst.getBalance() > ukr_p) {
                cst.charge(ukr_p);
            } else {
                System.out.println("Sorry, you don`t have enough money");
                return;
            }
        }
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("Enter your Shipping address ");
        /*String address =*/ terminalInput.nextLine();
        System.out.println("Thanks for your purchase");
    }

    private Plant freshness(Boquet b1) {
        CompareByFreshness comparator = new CompareByFreshness();
        Plant min1 = b1.getPlants().get(0);
        for (int i = 1; i < b1.getPlants().size()- 1; i++) {
            int mn = comparator.compare(min1, b1.getPlants().get(i));
            if (mn > 0) {
                min1 = b1.getPlants().get(i);
            }
        }
        return min1;
    }

    private int names_count(Boquet b1, String name){
        int names = 0;
        for (int i = 0; i < b1.getPlants().size(); i++){
            if (b1.getPlants().get(i).getName().equals(name)){
                names += 1;
            }
        }
        return names;
    }
    public Boquet compare(Boquet b1, Boquet b2){
        System.out.println("Select type of compare: 1 length, 2 freshness, 3 price, 4 name");
        Scanner in = new Scanner(System.in);
        int typeOfCompare = in.nextInt();
        if (typeOfCompare == 1) {
            Plant plant1 = b1.getPlants().get(0);
            Plant plant2 = b2.getPlants().get(0);
            CompareBylength comparator = new CompareBylength();
            int compar = comparator.compare(plant1, plant2);
            if (compar > 0) {
                return b1;
            }
            else
                return b2;
        }
        else if (typeOfCompare == 2) {
            Plant b1_freshness = this.freshness(b1);
            Plant b2_freshness = this.freshness(b2);
            CompareByFreshness comparator = new CompareByFreshness();
            if (comparator.compare(b1_freshness, b2_freshness) > 0){
                return b1;
            }
        }
        else if (typeOfCompare == 3){
            if (b1.getPrice() <= b2.getPrice()){
                return  b1;
            }else
                return b2;
        }
        else if (typeOfCompare == 4){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a flower name ");
            String name = sc.nextLine();
            int b1_names = this.names_count(b1, name);
            int b2_names = this.names_count(b2, name);
            if (b1_names > b2_names){
                return b1;
            }
        }
        return b2;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "allPlants=" + allPlants +
                "\n, allBuqqets=" + allBuqqets +
                '}';
    }

    private void fillShopWithGoods(){// Запонює магазин квітами і букетами по замовчуванню
        for (int i=0; i<Flowers.values().length;i++){
            Plant plant = new Plant(Flowers.values()[i].name(),Flowers.values()[i].getSpecification());
            this.allPlants.add(plant);
        }

        for(int i=0; i<5; i++){
            Boquet boquet = new Boquet();
            for (int j=0; j<9;j++){
                boquet.addFlower(allPlants.get((int)(Math.random()*(this.allPlants.size()-1))));
            }
            this.allBuqqets.add(boquet);
        }
    }


}
