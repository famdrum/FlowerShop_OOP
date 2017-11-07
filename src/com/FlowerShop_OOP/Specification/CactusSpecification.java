package com.FlowerShop_OOP.Specification;

import com.FlowerShop_OOP.Specification.Specification;

import java.util.Date;

public class CactusSpecification extends Specification {
    CactusSpecification(int price, String name, String smell, int lengthOfStem, Date freshness, String originCountry) {
        super(price, name, smell, lengthOfStem, freshness, originCountry);
    }
}
