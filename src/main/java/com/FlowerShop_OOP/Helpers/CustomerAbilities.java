package com.FlowerShop_OOP.Helpers;

import com.FlowerShop_OOP.Comparators.CompareBoquetByPriceAsc;
import com.FlowerShop_OOP.Comparators.CompareBoquetByPriceDis;
import com.FlowerShop_OOP.Comparators.CompareByFreshness;
import com.FlowerShop_OOP.Entity.Customer;
import com.FlowerShop_OOP.Entity.Shop;
import com.FlowerShop_OOP.Main.Main;

import java.util.Collections;

/**
 * Created by Victor on 11.11.2017.
 */
public class CustomerAbilities {


    public void buyBoquet(Shop shop, Customer customer){
        shop.showAllBoquets();
        System.out.println("Choose boquet that you want to buy");
        int choose = Main.scanner.nextInt();
        choose = choose-1;
        Main.scanner.nextLine();
        shop.pay_online(customer, shop.getAllBuqqets().get(choose));
        shop.delivery(customer);
    }

    public void showBoqetsToCustomerByHisWilling(Shop shop){

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




        }

    }


}
