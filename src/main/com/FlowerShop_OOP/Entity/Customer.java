package main.com.FlowerShop_OOP.Entity;

/**
 * Created by Victor on 07.11.2017.
 */
public class Customer {
    private int moneyAvailable;

    Customer(int moneyAvailable) {
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
}
