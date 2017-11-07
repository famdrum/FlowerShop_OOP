package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Plant;
import com.FlowerShop_OOP.Specification.Specification;

import java.util.Comparator;

/**
 * Created by Victor on 07.11.2017.
 */
public class CompareByFreshness implements Comparator<Plant> {

    @Override
    public int compare(Plant o1, Plant o2) {
        return o1.getSpecification().getFreshness().compareTo(o2.getSpecification().getFreshness());
    }
}
