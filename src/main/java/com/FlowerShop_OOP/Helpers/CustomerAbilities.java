package com.FlowerShop_OOP.Helpers;

import com.FlowerShop_OOP.Comparators.*;
import com.FlowerShop_OOP.Entity.Customer;
import com.FlowerShop_OOP.Entity.Shop;
import com.FlowerShop_OOP.Main.Main;

import java.util.Collections;

/**
 * Created by Victor on 11.11.2017.
 */
public class CustomerAbilities {


    public static  void shopping(Shop shop, Customer customer) {
        String work = "y";
        System.out.println("You have such functions\n 1)Buy a existing boquet \n2)See boquets sorted by your criteria\n3)Make your own Boquet\n Choose what you want to do");
        int choose;

        while (work.equals("y")) {
            choose = Main.scanner.nextInt();
            switch (choose) {
                case 1: {
                    buyBoquet(shop, customer);
                    break;
                }
                case 2: {
                    showBoqetsToCustomerByHisWilling(shop);
                    break;
                }
                case 3: {
                    makeYourOwnBoquet(shop,customer);
                    break;
                }
                default: {
                    System.out.println("Chose correct option");
                    continue;
                }
            }
            System.out.println("Do you want to do something else?\ny-For yes, anything else for no");
            work = Main.scanner.nextLine();
        }
    }

    private static  void buyBoquet(Shop shop, Customer customer){
        shop.showAllBoquets();
        System.out.println("Choose boquet that you want to buy");
        int choose = Main.scanner.nextInt();
        choose = choose-1;
        Main.scanner.nextLine();
        shop.payOnline(customer, shop.getAllBuqqets().get(choose));
        shop.delivery(customer);
    }

    private static void showBoqetsToCustomerByHisWilling(Shop shop){

        System.out.println("We can show you buckets in way that you like\n1)Sorted by price Ascending\n2)Sorted by price Discending\n" +
                "3)Sorted by Freshness\n4)Sorted by lenght of stem discending\n5)Sorted by lenght of stem Ascending\n Please choose");
        String choose = Main.scanner.next();
        Main.scanner.nextLine();

        switch (Integer.parseInt(choose)){
            case 1:{
                Collections.sort(shop.getAllBuqqets(),new CompareBoquetByPriceAsc());
                shop.showAllBoquets();
                break;
            }
            case 2:{
                Collections.sort(shop.getAllBuqqets(),new CompareBoquetByPriceDis());
                shop.showAllBoquets();
                break;
            }
            case 3:{
                Collections.sort(shop.getAllBuqqets(), new CompareByFreshness());
                shop.showAllBoquets();
                break;
            }
            case 4:{
                Collections.sort(shop.getAllBuqqets(), new CompareByLenghtDis());

                shop.showAllBoquets();
                break;
            }
            case 5:{
                Collections.sort(shop.getAllBuqqets(), new CompareBylengthAsc());
                shop.showAllBoquets();
                break;
            }
            default:{
                System.out.println("Wrong choose option");
                shop.showAllBoquets();
                break;
            }
        }

    }

    private static void makeYourOwnBoquet(Shop shop,Customer customer){
        Worker.addNewBuquet(shop);
        shop.payOnline(customer, shop.getAllBuqqets().get(shop.getAllBuqqets().size()-1));
        shop.delivery(customer);

    }


}
