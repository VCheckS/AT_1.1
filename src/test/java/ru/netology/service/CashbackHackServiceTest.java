package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void cashBackTest() {
        CashbackHackService service= new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
    @Test
    public void testWhenAmountEqualBoundary() {
        CashbackHackService service= new CashbackHackService();
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
    @Test
    public void testWhenAmountNull() {
        CashbackHackService service= new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
    @Test
    public void testWhenAmountMoreThen10k() {
        CashbackHackService service= new CashbackHackService();
        int amount = 10010;
        int expected = 990;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

}