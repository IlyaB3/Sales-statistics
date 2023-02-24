package ru.netology.stats.Salesstatistics.services;

public class StatsService {


    public int sumOfAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSalesPerMonth(int[] sales) {
        int average = sumOfAllSales(sales) / sales.length;
        return average;
    }

    public int maximumSalesPeakMonth(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minimumSalesPeakMonth(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthsOfSalesBelowAverage(int[] sales) { // Месяцы с продажами ниже среднего
        int monthsBelowAverage = 0;
        for (int sale : sales) {
            if (sale < averageSalesPerMonth(sales)) {
                monthsBelowAverage += 1;
            }
        }
        return monthsBelowAverage;
    }

    public int monthsOfSalesAboveAverage(int[] sales) { // Месяцы с продажами выше среднего
        int monthsAboveAverage = 0;
        for (int sale : sales) {
            if (sale > averageSalesPerMonth(sales)) {
                monthsAboveAverage += 1;
            }
        }
        return monthsAboveAverage;
    }
}
