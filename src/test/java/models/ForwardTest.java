package models;

import models.Forward;
import models.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForwardTest {


    Player kevinDurant;
    Player lukaDoncic;
    @BeforeEach
    void setUp() {
        kevinDurant = new Forward("Kevin Durant", 34,"6'11",5);
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
      lukaDoncic.addStrengthAttribute(lukaDoncic.getDribbling());

    }

    @Test
    void getName() {
        assertSame("Luka Doncic", lukaDoncic.getName());
    }

    @Test
    void getAge() {   assertSame(23, lukaDoncic.getAge());
    }

    @Test
    void getHeightInFeet() {  assertSame("6'7", lukaDoncic.getHeightInFeet());
    }

    @Test
    void getStrengths() {
        assertEquals(3, lukaDoncic.getStrengths());
    }

    @Test
    void setdunk() {
        kevinDurant.setDunk(99);
        assertEquals(99, kevinDurant.getDunk());
    }

    @Test
    void setInsideDefense() {
        kevinDurant.setInsideDefense(99);
        assertEquals(99, kevinDurant.getInsideDefense());
    }

    @Test
    void setInsideShot() {
        kevinDurant.setInsideShot(99);
        assertEquals(99, kevinDurant.getInsideShot());
    }

    @Test
    void setMidRangeShot() {
        kevinDurant.setMidRangeShot(99);
        assertEquals(99, kevinDurant.getMidRangeShot());
    }

    @Test
    void setPassing() {
        kevinDurant.setPassing(99);
        assertEquals(99, kevinDurant.getPassing());
    }

    @Test
    void setOutsideDefense() {
        kevinDurant.setOutsideDefense(99);
        assertEquals(99, kevinDurant.getOutsideDefense());
    }

    @Test
    void setRebounding() {
        kevinDurant.setRebounding(99);
        assertEquals(99, kevinDurant.getRebounding());
    }

    @Test
    void setSpeed() {
        kevinDurant.setSpeed(99);
        assertEquals(99, kevinDurant.getSpeed());
    }

    @Test
    void setThreePointShot() {
        kevinDurant.setThreePointShot(99);
        assertEquals(99, kevinDurant.getThreePointShot());
    }

    @Test
    void addStrengthAttribute() {
        kevinDurant.addStrengthAttribute(kevinDurant.getThreePointShot());
        assertEquals(4, kevinDurant.getStrengths());
    }

    @Test
    void defensivePlay() {
        assertEquals("Kevin Durant with a shot contest!", kevinDurant.defensivePlay());
    }

    @Test
    void offensivePlay() {
        assertEquals("Kevin Durant with a dunk!", kevinDurant.offensivePlay());
    }

}