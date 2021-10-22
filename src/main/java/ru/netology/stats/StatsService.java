package ru.netology.stats;

public class StatsService<monthSales> {


    public int sales(int[] monthSales) {
        int sum = 0;
        for (int sale : monthSales) {
            sum += sale;
        }
        return sum;

    }

    public int averageSale(int[] monthSales) {
        int average = 0;
        for (int sale : monthSales)
            average = sale + average;
        return ((average) / monthSales.length);
    }

    public int maxSales(int[] monthSales) {
        int maxMonth = 0;
        int month = 0;
        int currentIndex = 0;
        for (int sale : monthSales) {
            if (sale >= maxMonth) {
                maxMonth = sale;
                month = currentIndex;
            }
            currentIndex += 1;
        }
        return month + 1;
    }

    public int minSales(int[] monthSales) {
        int minMonth = 100;
        int month = 0;
        int currentIndex = 0;
        for (int sale : monthSales) {
            if (sale <= minMonth) {
                minMonth = sale;
                month = currentIndex;
            }
            currentIndex += 1;
        }
        return month + 1;
    }

    public int countAboveAver(int[] monthSales) {
        int count = 0;
        int average = averageSale(monthSales);
        for (int sale : monthSales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int countBelowAver(int[] monthSales) {
        int count = 0;
        for (int sale : monthSales) {
            if (sale > averageSale(monthSales)) {
                count++;
            }
        }
        return count;
    }
}