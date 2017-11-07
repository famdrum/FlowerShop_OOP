package com.FlowerShop_OOP.Main;

import com.FlowerShop_OOP.Entity.Plant;
import com.FlowerShop_OOP.Specification.RoseSpecification;
import com.FlowerShop_OOP.Comparators.CompareByPrice;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        new RoseSpecification(2,"good",2*2,new Date(),"Country","red");



        Plant plant = new Plant("plant "+1, new RoseSpecification(1,"good",2,new Date(),"Country","red"));
        Plant plant1 = new Plant("plant "+2, new RoseSpecification(2,"good",3,new Date(),"Country","red"));

        System.out.println(plant.compare(plant1, new CompareByPrice()));


    }
}
