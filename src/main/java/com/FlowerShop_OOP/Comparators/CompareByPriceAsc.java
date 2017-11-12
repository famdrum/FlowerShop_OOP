package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Plant;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by Victor on 07.11.2017.
 */
public class CompareByPriceAsc implements Comparator<Plant>,Serializable {


    private static final long serialVersionUID = 5816271196161937906L;

    public int compare(Plant o1, Plant o2) {
        return o1.getSpecification().getPrice()-o2.getSpecification().getPrice();
    }
}
