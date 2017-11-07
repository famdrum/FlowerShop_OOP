package com.FlowerShop_OOP.Entity;

import com.FlowerShop_OOP.Specification.Specification;

public class Plant {
    private String name;
    private Specification specification;

    Plant(String name, Specification specification) {
        this.name = name;
        this.specification = specification;
    }

    public String getName() {
        return name;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
