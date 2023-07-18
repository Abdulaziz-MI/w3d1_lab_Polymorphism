package models;

import models.Guard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuardTest {

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

    }

    @Test
    void getName() {
        String actual = kyrieIrving.getName();
        String expected ="Kyrie Irving";
        assertSame(expected, actual);
    }

    @Test
    void getAge() {
        int actual = kyrieIrving.getAge();
        int expected =30;
        assertEquals(expected, actual);
    }

    @Test
    void getHeight() {
        String actual = kyrieIrving.getHeightInFeet();
        String expected ="6'3";
        assertSame(expected, actual);
    }

    @Test
    void getStrengths() {

        kyrieIrving.addStrengthAttribute(kyrieIrving.getPassing());
        int actual = (kyrieIrving.getStrengths());
        int expected =4;
        assertSame(expected, actual);
    }

    @Test
    void addStrengthAttribute() {
        kyrieIrving.addStrengthAttribute(100);

        int actual = (kyrieIrving.getStrengths());
        int expected =4;
        assertSame(expected, actual);
    }

    @Test
    void defensivePlay(){
        String actual = (kyrieIrving.defensivePlay());
        String expected = "Kyrie Irving with a steal!";
        assertEquals(expected, actual);
    }    @Test
    void offensivePlay(){
        String actual = (kyrieIrving.offensivePlay());
        String expected = "Kyrie Irving with a layup!";
        assertEquals(expected, actual);
    }


}