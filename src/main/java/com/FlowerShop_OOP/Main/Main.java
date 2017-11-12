package com.FlowerShop_OOP.Main;

import com.FlowerShop_OOP.Entity.Customer;
import com.FlowerShop_OOP.Entity.Shop;
import com.FlowerShop_OOP.Helpers.CustomerAbilities;
import com.FlowerShop_OOP.Helpers.Worker;
import java.util.Scanner;

public class Main {

    static final public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)throws CloneNotSupportedException  {
        Shop shop = new Shop();

        String role = "1";
        while (!role.equals("3")) {
            System.out.println("Choose your role\n1-Client\n2-Admin\n3-end work");
            role = scanner.next();
            scanner.nextLine();

            switch (Integer.parseInt(role)) {
                case 1: {
                    System.out.println("How much money do you have?");
                    Customer customer = new Customer(scanner.nextInt());
                    CustomerAbilities.shopping(shop, customer);
                    break;
                }
                case 2: {
                    Worker.work(shop);
                    break;
                }
                default:{
                    System.out.println("Thank`s");
                }
            }
        }
        scanner.close();
    }
}


