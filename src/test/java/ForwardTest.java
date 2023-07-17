import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForwardTest {


    Player kevinDurant;
    Player lukaDoncic;
    @BeforeEach
    void setUp() {
        kevinDurant = new Forward("Kevin Durant", 34,"6'11");
        kevinDurant.setMidRangeShot(99);
        kevinDurant.setThreePointShot(98);
        kevinDurant.setDunks(89);
        kevinDurant.addStrengthAttribute(kevinDurant.midRangeShot);
        kevinDurant.addStrengthAttribute(kevinDurant.threePointShot);
        kevinDurant.addStrengthAttribute(kevinDurant.dunks);

        lukaDoncic =new Forward("Luka Doncic", 23,"6'7");
      lukaDoncic.setThreePointShot(97);
      lukaDoncic.setPassing(98);
      lukaDoncic.setDribbling(96);
      lukaDoncic.addStrengthAttribute(lukaDoncic.threePointShot);
      lukaDoncic.addStrengthAttribute(lukaDoncic.passing);
      lukaDoncic.addStrengthAttribute(lukaDoncic.dribbling);

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
    void setDunks() {
        kevinDurant.setDunks(99);
        assertEquals(99, kevinDurant.getDunks());
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
        kevinDurant.addStrengthAttribute(kevinDurant.threePointShot);
        assertTrue(kevinDurant.strengths.contains(kevinDurant.threePointShot));
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