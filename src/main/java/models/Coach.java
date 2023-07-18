package models;

import interfaces.ISell;

public class Coach implements ISell {

        protected  String name;
        protected  int age;

       protected int defensiveCoaching;
       protected int offensiveCoaching;

        protected int priceInMillion;



        public Coach (String name, int age, int defensiveCoaching, int offensiveCoaching, int priceInMillion){
            this.name= name;
            this.age = age;
this.defensiveCoaching = defensiveCoaching;
this.offensiveCoaching = offensiveCoaching;
            this.priceInMillion = priceInMillion;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getDefensiveCoaching(){return this.defensiveCoaching;}
    public int getOffensiveCoaching(){return this.offensiveCoaching;}


    public String defensivePlay() {
        return "Zone defense";
    }  public String defensivePlay(String defensivePlay) {
        return "Coach " + this.getName() + " runs " + defensivePlay;
    }

    public String offensivePlay() {
        return "Pick and roll";
    }
    public String offensivePlay(String offensivePlay) {
        return "Coach " + this.getName() + " runs " + offensivePlay;
    }

    @Override
    public int getPriceInMillion() {
        return priceInMillion;
    }

    }