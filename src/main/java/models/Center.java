package models;

import interfaces.ISell;

public class Center extends Player {
    public Center(String name, int age, String heightInFeet, int priceInMillion) {
        super(name, age, heightInFeet, priceInMillion);
    }

    public String defensivePlay(){return this.name + " with a block!";}


    public String offensivePlay(){return this.name +" with a big-man dunk!";}





}

