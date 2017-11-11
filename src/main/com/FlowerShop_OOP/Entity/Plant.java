package main.com.FlowerShop_OOP.Entity;

import main.com.FlowerShop_OOP.Specification.Specification;

import java.util.Comparator;

public class Plant {
    private String name;
    private Specification specification;

    public Plant(String name, Specification specification) {
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

    public int compare(Plant o2, Comparator<Plant> comparator) {
        return comparator.compare(this,o2); // Returns value that is > 0  if calling obj is greather by some parameter or value  < 0 if o2 is smaller
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", specification=" + specification +
                '}';
    }
}
