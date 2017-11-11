package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Boquet;

import java.util.Comparator;

/**
 * Created by Victor on 11.11.2017.
 */
public class CompareBoquetByPriceDis implements Comparator<Boquet> {
    public int compare(Boquet o1, Boquet o2) {
        return -(o1.getPrice()-o2.getPrice());
    }
}
