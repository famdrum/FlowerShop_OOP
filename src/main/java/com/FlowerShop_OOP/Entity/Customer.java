package com.FlowerShop_OOP.Entity;

/**
 * Created by Victor on 07.11.2017.
 */
public class Customer  implements  Cloneable {
    private int moneyAvailable;

     public Customer(int moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public void charge(int amount) {
        moneyAvailable -= amount;
    }


    public void setMoneyAvailable(int moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public int getBalance() {
        return moneyAvailable;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "moneyAvailable=" + moneyAvailable +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
