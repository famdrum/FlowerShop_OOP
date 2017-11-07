package com.FlowerShop_OOP.com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Plant;
import com.FlowerShop_OOP.Specification.Specification;

import java.util.Comparator;

/**
 * Created by Victor on 07.11.2017.
 */
public class CompareByPrice implements Comparator<Plant> {


    @Override
    public int compare(Plant o1, Plant o2) {
        return o1.getSpecification().getPrice()-o2.getSpecification().getPrice();
    }
}
