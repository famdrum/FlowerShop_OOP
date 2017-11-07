package com.FlowerShop_OOP.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 06.11.2017.
 */
public class Boquet {

    private List<Plant> plants;
    private int price;


    public Boquet() {
        plants = new ArrayList<>();
    }

    public Boquet(List<Plant> plants) {
        this.plants = plants;
        for (Plant p: plants) {
            price+=p.getSpecification().getPrice();
        }
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
