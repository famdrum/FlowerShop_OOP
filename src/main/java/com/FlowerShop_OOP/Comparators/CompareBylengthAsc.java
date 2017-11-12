package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Boquet;


import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by Victor on 07.11.2017.
 */
public class CompareBylengthAsc implements Comparator<Boquet>,Serializable {


    private static final long serialVersionUID = -4627372391695772546L;

    public int compare(Boquet o1, Boquet o2) {
        return o1.getAvarageLenght()-o2.getAvarageLenght();
    }
}
