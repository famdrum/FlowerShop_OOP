package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Plant;

import java.util.Comparator;

/**
 * Created by Victor on 11.11.2017.
 */
public class CompareByPriceDis implements Comparator<Plant> {
    @Override
    public int compare(Plant o1, Plant o2) {
        return (-1)*(o1.getSpecification().getPrice()-o2.getSpecification().getPrice());
    }
}
