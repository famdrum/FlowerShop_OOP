package main.java.FlowerShop_OOP.Main;

import com.FlowerShop_OOP.Entity.Shop;
import com.FlowerShop_OOP.Helpers.Worker;

import java.util.Scanner;

public class Main {

    static public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome");
        Shop shop = new Shop();
        System.out.println("Choose your role\n 1-Client\n2-Admin");
        String role = scanner.next();
        scanner.nextLine();

        switch (Integer.parseInt(role)){
            case 1:{

                break;
            }
            case 2:{
                Worker.work(shop);
                break;
            }
        }

    }
}
