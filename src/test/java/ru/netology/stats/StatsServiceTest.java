package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateAllSales() {
    StatsService service = new StatsService();
    int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 180;

    int actual = service.sales(monthSales);
    assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageMonthSale() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSale(monthSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberMaxMonthSale() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(monthSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNumberMinMonthSale() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(monthSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateCountMonthAboveAverSale() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.countAboveAver(monthSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateCountMonthBelowAverSale() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.countBelowAver(monthSales);
        assertEquals(expected, actual);
    }
}
