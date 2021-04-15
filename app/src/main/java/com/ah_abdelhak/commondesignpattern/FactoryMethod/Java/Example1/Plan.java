package com.ah_abdelhak.commondesignpattern.FactoryMethod.Java.Example1;

abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}