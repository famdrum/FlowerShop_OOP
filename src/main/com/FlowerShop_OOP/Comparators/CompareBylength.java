package main.com.FlowerShop_OOP.Comparators;

import main.com.FlowerShop_OOP.Entity.Plant;

import java.util.Comparator;

/**
 * Created by Victor on 07.11.2017.
 */
public class CompareBylength implements Comparator<Plant> {

    @Override
    public int compare(Plant o1, Plant o2) {
        return o1.getSpecification().getLengthOfStem()-o2.getSpecification().getLengthOfStem();
    }
}
