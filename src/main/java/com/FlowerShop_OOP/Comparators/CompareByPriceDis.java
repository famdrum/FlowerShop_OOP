package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Plant;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by Victor on 11.11.2017.
 */
public class CompareByPriceDis implements Comparator<Plant>,Serializable {


    private static final long serialVersionUID = 8253641891911873759L;

    public int compare(Plant o1, Plant o2) {
        return (-1)*(o1.getSpecification().getPrice()-o2.getSpecification().getPrice());
    }
}
