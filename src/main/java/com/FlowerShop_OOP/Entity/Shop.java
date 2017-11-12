package com.FlowerShop_OOP.Entity;


import com.FlowerShop_OOP.Comparators.CompareByFreshness;
import com.FlowerShop_OOP.Comparators.CompareBylengthAsc;
import com.FlowerShop_OOP.Main.Main;
import com.FlowerShop_OOP.Specification.Specification;

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
        int num = Main.scanner.nextInt();
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

    public void delivery(Customer cst) {
        int ukr_p = 25;
        int new_p = 40;
        System.out.println("Select shipping method: 1 Нова пошта, 2 Укрпошта");
        int num = Main.scanner.nextInt();
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

        System.out.println("Enter your Shipping address ");
        String address = Main.scanner.nextLine();
        System.out.println("Thanks for your purchase");
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
    public Boquet compare(Boquet b1, Boquet b2){ //TODO Make only with comparators
        System.out.println("Select type of compare: 1 length, 2 freshness, 3 price, 4 name");
        int typeOfCompare = Main.scanner.nextInt();
        if (typeOfCompare == 1) {
            CompareBylengthAsc comparator = new CompareBylengthAsc();
            int compar = comparator.compare(b1, b2);
            if (compar > 0) {
                return b1;
            }else
                return b2;
        }
        else if (typeOfCompare == 2) {
            CompareByFreshness comparator = new CompareByFreshness();
            if (comparator.compare(b1, b2) > 0){
                return b1;
            }
            else
                return b2;
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
        return null;
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
            try {
                Plant plant = new Plant(Flowers.values()[i].name(), (Specification)Flowers.values()[i].getSpecification().clone());
                this.allPlants.add(plant);
            }catch (CloneNotSupportedException e){
                e.printStackTrace();

            }
        }
        for(int i=0; i<5; i++){
            Boquet boquet = new Boquet();
            for (int j=0; j<5;j++){
                Plant plant = new Plant(allPlants.get((int)(Math.random()*(this.allPlants.size()-1))));
                boquet.addFlower(plant);
            }
            this.allBuqqets.add(boquet);
        }
    }

    public void showAllBoquets(){
        System.out.println("Available boquets\n");
        for(int i=0; i<getAllBuqqets().size();i++){
            System.out.println(i+1+") "+getAllBuqqets().get(i));
        }
    }

    public void showAllFlowers(){
        System.out.println("Available flowers\n");
        for(int i=0; i<getAllPlants().size();i++){
            System.out.println((i+1)+") "+getAllPlants().get(i).getName()+" "+getAllPlants().get(i).getSpecification());
        }
    }

    public List<Plant> getAllPlants() {
        return allPlants;
    }

    public void setAllPlants(List<Plant> allPlants) {
        this.allPlants = allPlants;
    }

    public List<Boquet> getAllBuqqets() {
        return allBuqqets;
    }

    public void setAllBuqqets(List<Boquet> allBuqqets) {
        this.allBuqqets = allBuqqets;
    }





}
