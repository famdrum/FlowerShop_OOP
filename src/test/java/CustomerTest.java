package com.FlowerShop_OOP.Entity;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void charge() throws Exception {
        Customer customer = new Customer(200);
        customer.charge(20);
        assertThat("Wrong balance", 180, is(customer.getBalance()));
    }

    @Test
    public void setMoneyAvailable() throws Exception {
        Customer customer = new Customer(200);
        customer.charge(180);
        assertThat("Wrong balance", 180, is(customer.getBalance()));
    }

    @Test
    public void getBalance() throws Exception {
        Customer customer = new Customer(200);
        assertThat("Wrong balance", 200, is(customer.getBalance()));
    }

    @Test
    public void toString() throws Exception {
        Customer customer = new Customer(200);
        assertThat("Wrong balance", "Customer{moneyAvailable=200}", is(customer.toString()));
    }
}
