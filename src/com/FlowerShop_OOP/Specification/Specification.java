package com.FlowerShop_OOP.Specification;

import java.util.Date;

public  abstract class Specification {
    private int price;
    private String name;
    private String smell;
    private int lengthOfStem;
    private Date freshness;
    private String originCountry;

    Specification(int price, String name, String smell,
                  int lengthOfStem, Date freshness, String originCountry) {
        this.price = price;
        this.name = name;
        this.smell = smell;
        this.lengthOfStem = lengthOfStem;
        this.freshness = freshness;
        this.originCountry = originCountry;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getSmell() {
        return smell;
    }

    public int getLengthOfStem() {
        return lengthOfStem;
    }

    public Date getFreshness() {
        return freshness;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    // TODO: implement compare method
}
