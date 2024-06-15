package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    @Test
    public void testBuyMoreToReturnCashIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testBuyMoreToReturnCashIfAmount1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testBuyMoreToReturnCashIfAmount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

}