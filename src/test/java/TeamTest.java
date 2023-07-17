import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
Team team;
    Center nikolaJokic;
    Center joelEmbid;
    Forward kevinDurant;
    Forward lukaDoncic;
    Guard kyrieIrving;
    Guard stephenCurry;



    @BeforeEach
    void setUp() {
        team =new Team();

        nikolaJokic = new Center("Nikola Jokic", 28,"7'00");
        nikolaJokic.setMidRangeShot(96);
        nikolaJokic.setRebounding(98);
        nikolaJokic.setPassing(89);
        nikolaJokic.addStrengthAttribute(nikolaJokic.midRangeShot);
        nikolaJokic.addStrengthAttribute(nikolaJokic.rebounding);
        nikolaJokic.addStrengthAttribute(nikolaJokic.passing);

        joelEmbid =new Center("Joel Embid", 23,"7'00");
        joelEmbid.setDunks(97);
        joelEmbid.setRebounding(98);
        joelEmbid.setInsideShot(96);
        joelEmbid.addStrengthAttribute(joelEmbid.dunks);
        joelEmbid.addStrengthAttribute(joelEmbid.rebounding);
        joelEmbid.addStrengthAttribute(joelEmbid.insideShot);

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

        kyrieIrving = new Guard("Kyrie Irving", 30,"6'3");
        kyrieIrving.setDribbling(98);
        kyrieIrving.setThreePointShot(93);
        kyrieIrving.setPassing(80);
        kyrieIrving.addStrengthAttribute(kyrieIrving.dribbling);
        kyrieIrving.addStrengthAttribute(kyrieIrving.threePointShot);
        kyrieIrving.addStrengthAttribute(kyrieIrving.passing);

        stephenCurry =new Guard("Stephen Curry", 31,"6'3");
        stephenCurry.setThreePointShot(99);
        stephenCurry.setDribbling(95);
        stephenCurry.setPassing(82);
        stephenCurry.addStrengthAttribute(stephenCurry.threePointShot);
        stephenCurry.addStrengthAttribute(stephenCurry.dribbling);
        stephenCurry.addStrengthAttribute(stephenCurry.passing);


    }

    @Test
    void addPlayerToTeam() {
        team.addPlayerToTeam(kevinDurant);
        assertTrue(team.playersOnBench.contains(kevinDurant));

    }

    @Test
    void addPlayerToCourt() {
        team.addPlayerToTeam(kevinDurant);
        team.addPlayerToCourt(kevinDurant);

        assertTrue(team.playersOnCourt.contains(kevinDurant));
    }

    @Test
    void swapPlayer() {
        team.addPlayerToTeam(kevinDurant);
        team.addPlayerToTeam(lukaDoncic);
        team.addPlayerToCourt(kevinDurant);
team.SwapPlayer(kevinDurant,lukaDoncic);
        assertTrue(team.playersOnCourt.contains(lukaDoncic));
    }
    @Test
    void swapPlayerFail() {
        team.addPlayerToTeam(kevinDurant);
        team.addPlayerToTeam(lukaDoncic);
team.SwapPlayer(kevinDurant,lukaDoncic);
        assertFalse(team.playersOnCourt.contains(lukaDoncic));
    }
    @Test
    void maxPlayersOnCourt(){

        team.addPlayerToTeam(kevinDurant);
        team.addPlayerToCourt(kevinDurant);

        team.addPlayerToTeam(lukaDoncic);
        team.addPlayerToCourt(lukaDoncic);

        team.addPlayerToTeam(stephenCurry);
        team.addPlayerToCourt(stephenCurry);

        team.addPlayerToTeam(kyrieIrving);
        team.addPlayerToCourt(kyrieIrving);

        team.addPlayerToTeam(nikolaJokic);
        team.addPlayerToCourt(nikolaJokic);

        team.addPlayerToTeam(joelEmbid);
        team.addPlayerToCourt(joelEmbid);// 6th player added
//if true then the last player is not added
        assertEquals(5, team.playersOnCourt.size());




    }

}