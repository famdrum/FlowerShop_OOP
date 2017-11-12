package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Boquet;

import java.util.Comparator;

/**
 * Created by Victor on 12.11.2017.
 */
public class CompareByLenghtDis implements Comparator<Boquet> {
    public int compare(Boquet o1, Boquet o2) {
        return -(o1.getAvarageLenght()-o2.getAvarageLenght());
    }
}
