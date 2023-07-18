package models;

import interfaces.ISell;

public class Forward extends Player{
    public Forward(String name, int age, String heightInFeet, int priceInMillion) {
        super(name, age, heightInFeet, priceInMillion);
    }



    public String defensivePlay(){
        return this.name + " with a shot contest!";
    }



    public String offensivePlay(){
        return this.name +" with a dunk!";
    }



}

