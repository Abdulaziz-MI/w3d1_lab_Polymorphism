package models;

import interfaces.ISell;

public class Guard extends Player {



    public Guard(String name, int age, String heightInFeet, int priceInMillion) {
        super(name, age, heightInFeet, priceInMillion);
    }


public String defensivePlay(){
    return this.name + " with a steal!";
    }

    //OVERLOAD
    public String offensivePlay(){
       return this.name +" with a layup!";
    }


}


