package com.FlowerShop_OOP.Specification;

import java.util.Date;

/**
 * Created by Victor on 11.11.2017.
 */
public class SimpleSpecificaton extends Specification implements Cloneable {

    public SimpleSpecificaton(int price, String smell, int lengthOfStem, Date freshness, String originCountry) {
        super(price, smell, lengthOfStem, freshness, originCountry);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
