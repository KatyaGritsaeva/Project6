package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void shouldSumAllSale() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        //Вызываемый целевой метод
        int actual = service.SumSale(sales);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);

    }

    @Test
    void shouldFindAverageOfSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        //Вызываемый целевой метод
        int actual = service.FindAverage(sales);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMinSalesMonth() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        //Вызываемый целевой метод
        int actual = service.MonthOfMinimumSales(sales);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaxSalesMonth() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        //Вызываемый целевой метод
        int actual = service.MonthOfMaximumSales(sales);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthMoreThenAverage() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        //Вызываемый целевой метод
        int actual = service.MoreThenAverage(sales);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthLessThenAverage() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        //Вызываемый целевой метод
        int actual = service.LessThenAverage(sales);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

}

