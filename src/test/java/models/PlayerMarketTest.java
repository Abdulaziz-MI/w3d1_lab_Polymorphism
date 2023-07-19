package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerMarketTest {
    PlayerMarket playerMarket;
    Guard kyrieIrving;
    Guard stephenCurry;
    @BeforeEach
    void setUp() {
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
    }

    @Test
    void addPlayer() {
        playerMarket.addPlayer(kyrieIrving);
        assertEquals(1, playerMarket.getPlayersInMarket());
    }

    @Test
    void getPlayersInMarket() {
        playerMarket.addPlayer(kyrieIrving);
        assertEquals(1, playerMarket.getPlayersInMarket());
    }

    @Test
    void sellPlayer() {
        playerMarket.addPlayer(kyrieIrving);
        assertEquals(1,playerMarket.playersInMarket.size());
        playerMarket.sellPlayer(kyrieIrving);
        assertEquals(0,playerMarket.playersInMarket.size());
    }
}