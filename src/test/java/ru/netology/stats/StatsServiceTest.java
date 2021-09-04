package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSumAllSales() {
        StatsService service = new StatsService();
        int expected = 180;
        long actual = service.sumAllSales(sales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSales() {
        StatsService service = new StatsService();
        int expected = 15;
        long actual = service.averageSales(sales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        long actual = service.maxSales(sales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        long actual = service.minSales(sales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSumMonthsAboveAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        long actual = service.sumMonthsAboveAverageSales(sales) ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSumMonthsBelowAverageSales() {
        StatsService service = new StatsService();
        int expected = 5;
        long actual = service.sumMonthsBelowAverageSales(sales) ;
        assertEquals(expected, actual);
    }
}