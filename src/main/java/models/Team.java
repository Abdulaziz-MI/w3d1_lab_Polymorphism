package models;

import interfaces.ISell;

import java.util.ArrayList;

public class Team {

protected int budgetInMillion;
    protected ArrayList<ISell> teamMembers;
    protected ArrayList<Player> playersOnBench;
    protected ArrayList<Player>playersOnCourt;
    protected ArrayList<Coach> coaches;


    public Team() {
        budgetInMillion = 25;//each team starts with 20mill budget to buy players and a coach
        teamMembers = new ArrayList<>();
        playersOnBench= new ArrayList<>();
        playersOnCourt =new ArrayList<>();
        coaches = new ArrayList<>();

    }

    public void setBudgetInMillion(int budgetInMillion) {
        this.budgetInMillion = budgetInMillion;
    }

    public void addPlayerToCourt(Player player){

            if (this.playersOnCourt.size() < 5) {
                this.playersOnCourt.add(player);
                this.playersOnBench.remove(player);
            } else {
                System.out.println("There are five players on the court. Cannot add more players.");
            }

    }

    public void swapPlayer(Player playerOut, Player playerIn) {
        if (playersOnCourt.contains(playerOut) && playersOnBench.contains(playerIn)) {

            playersOnCourt.remove(playerOut);
            playersOnBench.add(playerOut);
            playersOnCourt.add(playerIn);
            playersOnBench.remove(playerIn);
        } else {System.out.println("One or both players are not in the expected positions.");}

    }

//Used to for coaches directly and used in the buy/sell-PlayerFromMarket methods below. (Not to be used to buy/sell players directly)
    public void sell(ISell iSell) {
        this.teamMembers.remove(iSell);
        this.budgetInMillion =+ iSell.getPriceInMillion();
        if (iSell instanceof Coach) {coaches.remove(iSell);}
        if(iSell instanceof Player) { playersOnBench.remove(iSell);}}

    public void buy(ISell iSell) {
    this.teamMembers.add(iSell);
    this.budgetInMillion =-iSell.getPriceInMillion();
        if (iSell instanceof Coach) {coaches.add((Coach) iSell);}
        if (iSell instanceof Player){playersOnBench.add((Player) iSell);}}


    public void buyPlayerFromMarket(PlayerMarket playerMarket, Player Player){
        this.buy(Player);
        playerMarket.sellPlayer(Player);
    }
    public void sellPlayerToMarket(PlayerMarket playerMarket, Player player){this.sell(player); playerMarket.addPlayer(player);
    }

    public ArrayList<Coach> getCoaches() {
        return coaches;
    }

    public ArrayList<ISell> getTeamMembers() {
        return teamMembers;
    }

    public ArrayList<Player> getPlayersOnBench() {
        return playersOnBench;
    }

    public ArrayList<Player> getPlayersOnCourt() {
        return playersOnCourt;
    }

    public int getBudgetInMillion() {
        return budgetInMillion;
    }


}

