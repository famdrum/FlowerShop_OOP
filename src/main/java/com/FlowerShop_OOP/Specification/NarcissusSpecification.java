package com.FlowerShop_OOP.Specification;

import java.util.Date;

public class NarcissusSpecification extends Specification implements Cloneable {
    public NarcissusSpecification(int price, String smell, int lengthOfStem, Date freshness, String originCountry) {
        super(price,  smell, lengthOfStem, freshness, originCountry);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
