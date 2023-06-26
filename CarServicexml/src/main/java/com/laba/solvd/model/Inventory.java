package com.laba.solvd.model;

import java.util.Objects;

public class Inventory {

    private int quantity;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Inventory{" +
                "quantity=" + quantity +
                '}';
    }
}
