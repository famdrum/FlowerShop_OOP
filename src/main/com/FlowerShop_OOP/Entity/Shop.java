package main.com.FlowerShop_OOP.Entity;
import main.com.FlowerShop_OOP.Comparators.CompareByFreshness;
import main.com.FlowerShop_OOP.Comparators.CompareBylength;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    {
        allPlants = new ArrayList<>();
        allBuqqets = new ArrayList<>();



    }


    private List<Plant> allPlants;
    private List<Boquet> allBuqqets;






    public Shop(){
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
    private int minVal(Boquet b1){
        int minValue = b1.getPlants().get(0).getSpecification().getLengthOfStem();
        for (int i = 0; i < b1.getPlants().size(); i++){
            if (b1.getPlants().get(i).getSpecification().getLengthOfStem() < minValue) {
                minValue = b1.getPlants().get(i).getSpecification().getLengthOfStem();
            }
        }
        return minValue;
    }

    private Boquet cut(Boquet b1, int minval){
        for (int i = 0; i < b1.getPlants().size(); i++) {
            b1.getPlants().get(i).getSpecification().setLengthOfStem(minval);
        }
        return b1;
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
            int minValueb1 = this.minVal(b1);
            int minValueb2 = this.minVal(b2);
            b1 = this.cut(b1, minValueb1);
            b2 = this.cut(b2, minValueb2);
            Plant plant1 = b1.getPlants().get(0);
            Plant plant2 = b2.getPlants().get(0);
            CompareBylength comparator = new CompareBylength();
            int compar = comparator.compare(plant1, plant2);
            if (compar > 0) {
                return b1;
            }
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
            if (b1.getPrice() < b2.getPrice()){
                return  b1;
            }
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
}
