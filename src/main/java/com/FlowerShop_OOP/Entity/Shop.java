package com.FlowerShop_OOP.Entity;


import com.FlowerShop_OOP.Comparators.CompareByFreshness;
import com.FlowerShop_OOP.Comparators.CompareBylengthAsc;
import com.FlowerShop_OOP.Main.Main;
import com.FlowerShop_OOP.Specification.Specification;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Plant> allPlants;
    private List<Boquet> allBuqqets;
    public Shop() {
        allPlants = new ArrayList<>();
        allBuqqets = new ArrayList<>();
        fillShopWithGoods();
    }

    public void payOnline(Customer cst, Boquet boquet) {
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
        int ukr = 25;
        int newp = 40;
        System.out.println("Select shipping method: 1 Нова пошта, 2 Укрпошта");
        int num = Main.scanner.nextInt();
        if (num == 1) {
            if (cst.getBalance() > newp) {
                cst.charge(newp);
            } else {
                System.out.println("Sorry, you don`t have enough money");
                return;
            }
        } else if (num == 2) {
            if (cst.getBalance() > ukr) {
                cst.charge(ukr);
            } else {
                System.out.println("Sorry, you don`t have enough money");
                return;
            }
        }
        System.out.println("Thanks for your purchase");
    }

    private int namesCount(Boquet b1, String name) {
        int names = 0;
        for (int i = 0; i < b1.getPlants().size(); i++) {
            if (b1.getPlants().get(i).getName().equals(name)){
                names += 1;
            }
        }
        return names;
    }

    public Boquet compare(Boquet one, Boquet two) { //TODO Make only with comparators
        System.out.println("Select type of compare: 1 length, 2 freshness, 3 price, 4 name");
        int typeOfCompare = Main.scanner.nextInt();
        if (typeOfCompare == 1) {
            CompareBylengthAsc comparator = new CompareBylengthAsc();
            int compar = comparator.compare(one, two);
            if (compar > 0) {
                return one;
            }else
                return two;
        }
        else if (typeOfCompare == 2) {
            CompareByFreshness comparator = new CompareByFreshness();
            if (comparator.compare(one, two) > 0){
                return one;
            }
            else
                return two;
        }
        else if (typeOfCompare == 3) {
            if (one.getPrice() <= two.getPrice()) {
                return  one;
            }else
                return two;
        }
        else if (typeOfCompare == 4) {
            System.out.println("Enter a flower name ");
            String name = Main.scanner.nextLine();
            int bone = this.namesCount(one, name);
            int btwo = this.namesCount(two, name);
            if (bone > btwo) {
                return one;
            }else
                return two;
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

    private void fillShopWithGoods() {// Запонює магазин квітами і букетами по замовчуванню
        for (int i = 0; i < Flowers.values().length; i++) {
            try {
                Plant plant = new Plant(Flowers.values()[i].name(), (Specification)Flowers.values()[i].getSpecification().clone());
                this.allPlants.add(plant);
            }catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        for(int i = 0; i < 5; i++) {
            Boquet boquet = new Boquet();
            for (int j = 0; j < 5; j++) {
                Plant plant = new Plant(allPlants.get((int)(Math.random()*(this.allPlants.size()-1))));
                boquet.addFlower(plant);
            }
            this.allBuqqets.add(boquet);
        }
    }

    public void showAllBoquets() {
        System.out.println("Available boquets\n");
        for(int i = 0; i < getAllBuqqets().size(); i++) {
            System.out.println(i+1+") "+getAllBuqqets().get(i));
        }
    }

    public void showAllFlowers() {
        System.out.println("Available flowers\n");
        for(int i = 0; i < getAllPlants().size(); i++) {
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
