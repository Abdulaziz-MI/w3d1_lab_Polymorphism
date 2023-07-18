package models;

import models.Forward;
import models.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenterTest {




    public Player nikolaJokic;
    public Player joelEmbid;
    @BeforeEach
    void setUp() {
        nikolaJokic = new Forward("Nikola Jokic", 28,"7'00",5);
        nikolaJokic.setMidRangeShot(96);
        nikolaJokic.setRebounding(98);
        nikolaJokic.setPassing(89);
        nikolaJokic.addStrengthAttribute(nikolaJokic.getMidRangeShot());
        nikolaJokic.addStrengthAttribute(nikolaJokic.getRebounding());
        nikolaJokic.addStrengthAttribute(nikolaJokic.getPassing());

        joelEmbid =new Forward("Joel Embid", 23,"7'00",5);
        joelEmbid.setDunk(97);
        joelEmbid.setRebounding(98);
        joelEmbid.setInsideShot(96);
        joelEmbid.addStrengthAttribute(joelEmbid.getDunk());
        joelEmbid.addStrengthAttribute(joelEmbid.getRebounding());
        joelEmbid.addStrengthAttribute(joelEmbid.getInsideShot());

    }

    @Test
    void getName() {
        assertSame("Nikola Jokic", nikolaJokic.getName());
    }

    @Test
    void getAge() {   assertSame(28, nikolaJokic.getAge());
    }

    @Test
    void getHeightInFeet() {  assertSame("7'00", nikolaJokic.getHeightInFeet());
    }

    @Test
    void getStrengths() {
        assertEquals(3, nikolaJokic.getStrengths());
    }

    @Test
    void setDunk() {
        joelEmbid.setDunk(99);
        assertEquals(99, joelEmbid.getDunk());
    }

    @Test
    void setInsideDefense() {
        joelEmbid.setInsideDefense(99);
        assertEquals(99, joelEmbid.getInsideDefense());
    }

    @Test
    void setInsideShot() {
        joelEmbid.setInsideShot(99);
        assertEquals(99, joelEmbid.getInsideShot());
    }

    @Test
    void setMidRangeShot() {
        joelEmbid.setMidRangeShot(99);
        assertEquals(99, joelEmbid.getMidRangeShot());
    }

    @Test
    void setPassing() {
        joelEmbid.setPassing(99);
        assertEquals(99, joelEmbid.getPassing());
    }

    @Test
    void setOutsideDefense() {
        joelEmbid.setOutsideDefense(99);
        assertEquals(99, joelEmbid.getOutsideDefense());
    }

    @Test
    void setRebounding() {
        joelEmbid.setRebounding(99);
        assertEquals(99, joelEmbid.getRebounding());
    }

    @Test
    void setSpeed() {
        joelEmbid.setSpeed(99);
        assertEquals(99, joelEmbid.getSpeed());
    }

    @Test
    void setThreePointShot() {
        joelEmbid.setThreePointShot(99);
        assertEquals(99, joelEmbid.getThreePointShot());
    }

    @Test
    void addStrengthAttribute() {
        joelEmbid.addStrengthAttribute(joelEmbid.getThreePointShot());
        assertEquals(4, joelEmbid.getStrengths());
    }

    @Test
    void defensivePlay() {
        assertEquals("Joel Embid with a shot contest!", joelEmbid.defensivePlay());
    }
    @Test
    void testDefensivePlay() {
        String actual = joelEmbid.defensivePlay("BIG BLOCK");
        String expected = "Joel Embid with a BIG BLOCK!";
        assertEquals(expected,actual);
    }

    @Test
    void offensivePlay() {
        assertEquals("Joel Embid with a dunk!", joelEmbid.offensivePlay());
    }

}
