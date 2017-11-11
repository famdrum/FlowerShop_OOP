package main.java.FlowerShop_OOP.Entity;

import main.java.FlowerShop_OOP.Specification.*;

import java.util.Date;

/**
 * Created by Victor on 11.11.2017.
 */
public enum Flowers {


    ROSE(new RoseSpecification(25,"light",25,new Date(),"Netherlands","red")),
    WHITEROSE(new RoseSpecification(35,"light",50,new Date(),"Netherlands","white")),
    CHAMOMILE(new ChamomileSpecification(10,"good",15,new Date(),"Ukraine")),
    NARCISSUS(new NarcissusSpecification(3,"nice",17,new Date(),"Russia")),
    TULIP(new TulipSpecification(14,"none",20,new Date(),"Poland"));

    private Specification specification;

    Flowers(Specification specification) {
        this.specification = specification;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
