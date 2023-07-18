package models;

import interfaces.ISell;

import java.util.ArrayList;

public abstract class Player implements ISell {
    protected  String name;
protected  int age;
protected String heightInFeet;
    protected int speed;
protected  int passing;
    protected int threePointShot;

    protected int midRangeShot;
    protected int dunk;
    protected int dribbling;
    protected int insideShot;
    protected int rebounding;
    protected int outsideDefense;
    protected int insideDefense;

    protected ArrayList<Integer> strengths;

    protected int priceInMillion;



public Player (String name, int age, String heightInFeet, int priceInMillion){
    this.name= name;
this.age = age;
this.heightInFeet = heightInFeet;
this.strengths = new  ArrayList<Integer>();
    this.priceInMillion = priceInMillion;
}



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHeightInFeet() {
        return heightInFeet;
    }

    public int getStrengths() {
        return this.strengths.size();
    }

    public void setDunk(int dunk) {
    this.dunk = dunk;
    }


    public void setInsideDefense(int insideDefense) {
        this.insideDefense = insideDefense;
    }

    public void setInsideShot(int insideShot) {
        this.insideShot = insideShot;
    }

    public void setMidRangeShot(int midRangeShot) {
        this.midRangeShot = midRangeShot;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public void setOutsideDefense(int outsideDefense) {
        this.outsideDefense = outsideDefense;
    }

    public void setRebounding(int rebounding) {
        this.rebounding = rebounding;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setThreePointShot(int threePointShot) {
        this.threePointShot = threePointShot;
    }

    public int getMidRangeShot() {
        return this.midRangeShot;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDunk() {
        return this.dunk;
    }

    public int getInsideDefense() {
        return this.insideDefense;
    }

    public int getInsideShot() {
        return this.insideShot;
    }

    public int getOutsideDefense() {
        return this.outsideDefense;
    }

    public int getPassing() {
        return this.passing;
    }

    public int getRebounding() {
        return this.rebounding;
    }

    public int getThreePointShot() {
        return this.threePointShot;
    }

    public int getDribbling() {return dribbling;}

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }


    public void addStrengthAttribute(int attribute){
    this.strengths.add(attribute);
    }


    public abstract String defensivePlay();// to be overridden

public String defensivePlay(String defensivePlay)//overload
    {return this.name + " with a "+ defensivePlay+"!";}


    public abstract String offensivePlay();// to be overridden

public String offensivePlay(String offensivePlay){return this.name +" with a "+ offensivePlay;
    }

    @Override
    public int getPriceInMillion() {
        return this.priceInMillion;
    }





}
