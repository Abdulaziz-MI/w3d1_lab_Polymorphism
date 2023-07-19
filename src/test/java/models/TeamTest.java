package models;

import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
Team team;
    Center nikolaJokic;
    Center joelEmbid;
    Player kevinDurant;
    Forward lukaDoncic;
    Guard kyrieIrving;
    Guard stephenCurry;
    Coach coach;
    PlayerMarket playerMarket;



    @BeforeEach
    void setUp() {
        team =new Team();

        coach = new Coach("Steve Kerr", 50,80,95,5);

        nikolaJokic = new Center("Nikola Jokic", 28,"7'00",5);
        nikolaJokic.setMidRangeShot(96);
        nikolaJokic.setRebounding(98);
        nikolaJokic.setPassing(89);
        nikolaJokic.addStrengthAttribute(nikolaJokic.getMidRangeShot());
        nikolaJokic.addStrengthAttribute(nikolaJokic.getRebounding());
        nikolaJokic.addStrengthAttribute(nikolaJokic.getPassing());

        joelEmbid =new Center("Joel Embid", 23,"7'00",5);
        joelEmbid.setDunk(97);
        joelEmbid.setRebounding(98);
        joelEmbid.setInsideShot(96);
        joelEmbid.addStrengthAttribute(joelEmbid.getDunk());
        joelEmbid.addStrengthAttribute(joelEmbid.getRebounding());
        joelEmbid.addStrengthAttribute(joelEmbid.getInsideShot());

        kevinDurant = new Forward("Kevin Durant", 34,"6'11", 5);
        kevinDurant.setMidRangeShot(99);
        kevinDurant.setThreePointShot(98);
        kevinDurant.setDunk(89);
        kevinDurant.addStrengthAttribute(kevinDurant.getMidRangeShot());
        kevinDurant.addStrengthAttribute(kevinDurant.getThreePointShot());
        kevinDurant.addStrengthAttribute(kevinDurant.getDunk());

        lukaDoncic =new Forward("Luka Doncic", 23,"6'7",5);
        lukaDoncic.setThreePointShot(97);
        lukaDoncic.setPassing(98);
        lukaDoncic.setDribbling(96);
        lukaDoncic.addStrengthAttribute(lukaDoncic.getThreePointShot());
        lukaDoncic.addStrengthAttribute(lukaDoncic.getPassing());
        lukaDoncic.addStrengthAttribute(lukaDoncic.getPassing());

        kyrieIrving = new Guard("Kyrie Irving", 30,"6'3",4);
        kyrieIrving.setDribbling(98);
        kyrieIrving.setThreePointShot(93);
        kyrieIrving.setPassing(80);
        kyrieIrving.addStrengthAttribute(kyrieIrving.getDribbling());
        kyrieIrving.addStrengthAttribute(kyrieIrving.getThreePointShot());
        kyrieIrving.addStrengthAttribute(kyrieIrving.getPassing());

        stephenCurry =new Guard("Stephen Curry", 31,"6'3",5);
        stephenCurry.setThreePointShot(99);
        stephenCurry.setDribbling(95);
        stephenCurry.setPassing(82);
        stephenCurry.addStrengthAttribute(stephenCurry.getThreePointShot());
        stephenCurry.addStrengthAttribute(stephenCurry.getDribbling());
        stephenCurry.addStrengthAttribute(stephenCurry.getPassing());
playerMarket =new PlayerMarket();

        playerMarket.addPlayer(joelEmbid);
        playerMarket.addPlayer(nikolaJokic);
        playerMarket.addPlayer(kevinDurant);
        playerMarket.addPlayer(lukaDoncic);
        playerMarket.addPlayer(stephenCurry);
        playerMarket.addPlayer(kyrieIrving);

    }

    @Test
    void addPlayerToTeam() {

        team.buyPlayerFromMarket(playerMarket,kevinDurant);
        assertTrue(team.getPlayersOnBench().contains(kevinDurant));

    }

    @Test
    void addPlayerToCourt() {
        team.buyPlayerFromMarket(playerMarket,kevinDurant);
        team.addPlayerToCourt(kevinDurant);

        assertTrue(team.getPlayersOnCourt().contains(kevinDurant));
    }

    @Test
    void swapPlayer() {
        team.buyPlayerFromMarket(playerMarket, kevinDurant);
        team.buyPlayerFromMarket(playerMarket,lukaDoncic);
        team.addPlayerToCourt(kevinDurant);
team.swapPlayer(kevinDurant,lukaDoncic);
        assertTrue(team.getPlayersOnCourt().contains(lukaDoncic));
    }
    @Test
    void swapPlayerFail() {
        team.buyPlayerFromMarket(playerMarket,kevinDurant);
        team.buyPlayerFromMarket(playerMarket,lukaDoncic);
team.swapPlayer(kevinDurant,lukaDoncic);
        assertFalse(team.getPlayersOnCourt().contains(lukaDoncic));
    }
    @Test
    void maxPlayersOnCourt(){
        team.setBudgetInMillion(100);
        team.buyPlayerFromMarket(playerMarket,kevinDurant);
        team.addPlayerToCourt(kevinDurant);

        team.buyPlayerFromMarket(playerMarket,lukaDoncic);
        team.addPlayerToCourt(lukaDoncic);

        team.buyPlayerFromMarket(playerMarket,stephenCurry);
        team.addPlayerToCourt(stephenCurry);

        team.buyPlayerFromMarket(playerMarket,kyrieIrving);
        team.addPlayerToCourt(kyrieIrving);

        team.buyPlayerFromMarket(playerMarket,nikolaJokic);
        team.addPlayerToCourt(nikolaJokic);

        team.buyPlayerFromMarket(playerMarket,joelEmbid);
        team.addPlayerToCourt(joelEmbid);// 6th player added
//if true then the last player is not added
        assertEquals(5, team.getPlayersOnCourt().size());}

    @Test public void sellPlayerToMarket(){
        team.buyPlayerFromMarket(playerMarket,kevinDurant);
        assertTrue(team.getTeamMembers().contains(kevinDurant));

        team.sellPlayerToMarket(playerMarket,kevinDurant);
        assertFalse(team.getTeamMembers().contains(kevinDurant));
    }

    @Test public void getTeamMembers(){
team.buyPlayerFromMarket(playerMarket,kevinDurant);
team.buy(coach);
        assertEquals(2, team.teamMembers.size());
    }
    @Test public void getCoaches(){
        team.buy(coach);
        assertEquals(1, team.getCoaches().size());
    }
    @Test public void getBudgetInMillion(){
        assertEquals(25, team.getBudgetInMillion());
    }

   @Test
    public void offensivePlay(){
       String actual = kevinDurant.offensivePlay("THREE");
       String expected = "Kevin Durant with a THREE";
   }

}