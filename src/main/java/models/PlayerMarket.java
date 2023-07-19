package models;

import interfaces.ISell;

import java.util.ArrayList;

public class PlayerMarket {

protected ArrayList<Player> playersInMarket;


public PlayerMarket(){
    playersInMarket =new ArrayList<>();
}
public void addPlayer(Player player) {
    this.playersInMarket.add(player);
    }

    public int getPlayersInMarket() {
        return this.playersInMarket.size();
    }

    public void sellPlayer(Player player){
    this.playersInMarket.remove(player);
    }
}

