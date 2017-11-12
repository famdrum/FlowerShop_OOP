package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Boquet;
import com.FlowerShop_OOP.Entity.Plant;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by Victor on 07.11.2017.
 */
public class CompareBylengthAsc implements Comparator<Boquet>,Serializable {

    public int compare(Boquet o1, Boquet o2) {
        return o1.getAvarageLenght()-o2.getAvarageLenght();
    }
}
