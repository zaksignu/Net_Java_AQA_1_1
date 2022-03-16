package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    static CashbackHackService cb = new CashbackHackService();

    @Test
    public void shouldWorkWell() {
        int actual = 1000;
        int expected = cb.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldWorkWell2() {

        int actual = 700;
        int expected = cb.remain(300);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldWorkWell3() {

        int actual = 900;
        int expected = cb.remain(1100);
        assertEquals(actual, expected);
    }
}