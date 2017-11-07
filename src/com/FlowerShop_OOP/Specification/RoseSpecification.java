package com.FlowerShop_OOP.Specification;

import java.util.Date;

public class RoseSpecification extends Specification {
    private String color;

    public RoseSpecification(int price, String smell,
                             int lengthOfStem, Date freshness,
                             String originCountry, String color) {
        super(price,  smell, lengthOfStem, freshness, originCountry);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
