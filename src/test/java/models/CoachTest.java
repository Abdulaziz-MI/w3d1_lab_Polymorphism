package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoachTest {
Team team;
Coach headCoach;
Coach assistantCoach;

    @BeforeEach
    void setUp() {
        team = new Team();
        headCoach = new Coach("Steve Kerr", 50,80,95,5);
        assistantCoach = new Coach("Phil Handy", 52,70,60,2);
    }

    @Test
    void getName() {
        assertEquals("Steve Kerr",   headCoach.getName());

    }

    @Test
    void getAge() {
        assertEquals(50,   headCoach.getAge());
    }

    @Test
    void getDefensiveCoaching() {
        assertEquals(80,   headCoach.getDefensiveCoaching());
    }

    @Test
    void getOffensiveCoaching() {
        assertEquals(95,   headCoach.getOffensiveCoaching());
    }

    @Test
    void defensivePlay() {
        String actual =headCoach.defensivePlay();
        String expected = "Zone defense";
        assertEquals(expected,actual);
    }

    @Test
    void testDefensivePlay() {
        String actual =headCoach.defensivePlay("tight  perimeter defense");
        String expected = "Coach Steve Kerr runs tight  perimeter defense";
        assertEquals(expected,actual);
    }

    @Test
    void offensivePlay() {
        String actual =headCoach.offensivePlay();
        String expected = "Pick and roll";
        assertEquals(expected,actual);
    }

    @Test
    void testOffensivePlay() {
        String actual =headCoach.offensivePlay("pick and pop");
        String expected = "Coach Steve Kerr runs pick and pop";
        assertEquals(expected,actual);
    }

    @Test
    void getPriceInMillion() {
        int actual =headCoach.getPriceInMillion();
        int expected= 5;
        assertEquals(expected,actual);
    }
}