package com.FlowerShop_OOP.Entity;

import java.util.ArrayList;

import java.util.List;

/**
 * Created by Victor on 06.11.2017.
 */
public class Boquet {

    private List<Plant> plants;
    private int price;
    private  int avarageLenght;


    public Boquet() {
        plants = new ArrayList<Plant>();
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

    public int getAvarageLenght() {
        return avarageLenght;
    }

    public void setAvarageLenght(int avarageLenght) {
        this.avarageLenght = avarageLenght;
    }

    public void addFlower(Plant plant){
        this.plants.add(plant);
        this.price+=plant.getSpecification().getPrice();
        this.avarageLenght=averageVal();
    }
    public  void removeFlower(Plant plant) {
        this.plants.remove(plant);
        this.price-=plant.getSpecification().getPrice();
    }


    private int averageVal(){

        int avarageValue = getPlants().get(0).getSpecification().getLengthOfStem();

        for (int i = 0; i < getPlants().size(); i++){
                avarageValue += getPlants().get(i).getSpecification().getLengthOfStem();
        }
        avarageValue =(int)(avarageValue/getPlants().size());

        return  avarageValue;
    }


    @Override
    public String toString() {
        return  "\nComponents =\n" + plants +
                "\nPrice=" + price +
                "$\nAvarageLenght=" + avarageLenght;
    }
}
