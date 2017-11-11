package main.java.FlowerShop_OOP.Comparators;

import main.java.FlowerShop_OOP.Entity.Plant;

import java.util.Comparator;

/**
 * Created by Victor on 07.11.2017.
 */
public class CompareByPriceAsc implements Comparator<Plant> {

    public int compare(Plant o1, Plant o2) {
        return o1.getSpecification().getPrice()-o2.getSpecification().getPrice();
    }
}
