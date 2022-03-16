package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    static CashbackHackService cb = new CashbackHackService();

    @Test
    public void shouldWorkWellAtEdge() {
        int actual =0;
        int expected = cb.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldWork() {

        int actual = 700;
        int expected = cb.remain(300);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldWorkWellMoreThan1000() {

        int actual = 900;
        int expected = cb.remain(1100);
        assertEquals(actual, expected);
    }
}