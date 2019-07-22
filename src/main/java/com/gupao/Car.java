package com.gupao;

import java.io.Serializable;

/**
 * Created by DJ on 2019年07月22日 17:10
 **/
public class Car implements Cloneable,Serializable {
    private String number = "车号";
    private double price = 50000;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected Car clone(){
        try{
            return (Car) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
