package ru.netology.stats.Salesstatistics.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maximumSalesPeakMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void totalOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSalesPerMonth(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minimumSalesPeakMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void amountIsBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMonth = 5;
        int actualSumMonth = service.monthsOfSalesBelowAverage(sales);

        Assertions.assertEquals(expectedSumMonth, actualSumMonth);
    }

    @Test
    public void aboveAverageAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumMonth = 5;
        int actualSumMonth = service.monthsOfSalesAboveAverage(sales);

        Assertions.assertEquals(expectedSumMonth, actualSumMonth);
    }
}
