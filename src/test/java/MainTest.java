package com.FlowerShop_OOP.Main;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void main() throws Exception {
        Main m = new Main();
        if (Main.scanner == null) throw new Exception();
    }
}