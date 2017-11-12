package com.FlowerShop_OOP.Comparators;

import com.FlowerShop_OOP.Entity.Boquet;
import com.FlowerShop_OOP.Entity.Plant;

import java.util.Comparator;

/**
 * Created by Victor on 07.11.2017.
 */
public class CompareByFreshness implements Comparator<Boquet> {

    public int compare(Boquet o1, Boquet o2) {
        Plant b1_freshness = this.freshness(o1);
        Plant b2_freshness = this.freshness(o2);
        CompareByFreshness comparator = new CompareByFreshness();
        if (b1_freshness.getSpecification().getFreshness().compareTo(b2_freshness.getSpecification().getFreshness()) > 0){
            return 1;
        }else
            return -1;

    }

    private Plant freshness(Boquet b1) {
        Plant min1 = b1.getPlants().get(0);
        for (int i = 1; i < b1.getPlants().size()-1; i++) {
            if (b1.getPlants().get(i).getSpecification().getFreshness().compareTo(min1.getSpecification().getFreshness())>0) {
                min1 = b1.getPlants().get(i);
            }
        }
        return min1;
    }



}