package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int sum = calculateSum(sales);
        int month = sales.length;
        int average = sum / month;
        return average;
    }

    public int findMax(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int findMin (int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int findMonthsBelowAverage (int[] sales) {
        int average = calculateAverage(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month = month + 1;
            }
        }
        return month;
    }

    public int findMonthsAboveAverage(int[] sales) {
        int average = calculateAverage(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month = month + 1;
            }
        }
        return month;
    }
}
