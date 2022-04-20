package ru.netology.stats;

public class StatsService {
    public int SumSale(int[] sales) {
        int sumAllSale = 0;
        for (int sale : sales)
            sumAllSale += sale;
        return sumAllSale;
    }


    public int FindAverage(int[] sales) {
        return SumSale(sales) / sales.length;
    }


    public int MonthOfMinimumSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int MonthOfMaximumSales(int[] sales) {
        int manMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[manMonth]) {
                manMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return manMonth + 1;
    }


    public int MoreThenAverage(int[] sales) {
        int average = SumSale(sales) / sales.length;
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count = count + 1;
            }
        }
        return count;
    }


    public int LessThenAverage(int[] sales) {
        int average = SumSale(sales) / sales.length;
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count = count + 1;
            }
        }
        return count;
    }

}
