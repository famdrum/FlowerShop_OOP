package main.java.FlowerShop_OOP.Entity;

import java.util.ArrayList;

import java.util.List;

/**
 * Created by Victor on 06.11.2017.
 */
public class Boquet {

    private List<Plant> plants;
    private int price;


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

    public void addFlower(Plant plant){
        this.plants.add(plant);
        this.price+=plant.getSpecification().getPrice();
        this.cut(this,minVal(this));
    }
    public  void removeFlower(Plant plant) {
        this.plants.remove(plant);
        this.price-=plant.getSpecification().getPrice();
    }


    private int minVal(Boquet b1){
        int minValue = b1.getPlants().get(0).getSpecification().getLengthOfStem();
        for (int i = 0; i < b1.getPlants().size(); i++){
            if (b1.getPlants().get(i).getSpecification().getLengthOfStem() < minValue) {
                minValue = b1.getPlants().get(i).getSpecification().getLengthOfStem();
            }
        }
        return minValue;
    }

    private Boquet cut(Boquet b1, int minval){
        for (int i = 0; i < b1.getPlants().size(); i++) {
            b1.getPlants().get(i).getSpecification().setLengthOfStem(minval);
        }
        return b1;
    }


    @Override
    public String toString() {
        return "Boquet{" +
                "plants=" + plants +
                ", price=" + price +
                "\n";
    }
}
