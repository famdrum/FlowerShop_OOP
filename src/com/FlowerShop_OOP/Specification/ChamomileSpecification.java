package com.FlowerShop_OOP.Specification;

import com.FlowerShop_OOP.Specification.Specification;

import java.util.Date;

public class ChamomileSpecification extends Specification {
    ChamomileSpecification(int price, String name, String smell, int lengthOfStem, Date freshness, String originCountry) {
        super(price, name, smell, lengthOfStem, freshness, originCountry);
    }
}
