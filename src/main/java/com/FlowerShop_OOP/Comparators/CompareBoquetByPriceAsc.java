package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Boquet;
import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by Victor on 11.11.2017.
 */
public class CompareBoquetByPriceAsc implements Comparator<Boquet>, Serializable {


    private static final long serialVersionUID = 1857114410476697626L;

    public int compare(Boquet o1, Boquet o2) {
        return  o1.getPrice()-o2.getPrice();
    }
}
