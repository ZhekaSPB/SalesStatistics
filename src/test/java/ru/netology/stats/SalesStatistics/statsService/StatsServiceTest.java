package ru.netology.stats.SalesStatistics.statsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void monthMaximumSales() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.maxSales(arr);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void summaSales() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 180;
        int actualDay = service.calculateSumSales(arr);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void findAverage() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 15;
        int actualDay = service.findAverage(arr);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 10;
        int actualDay = service.salesBelowAverage(arr);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void salesAboveAverage() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 11;
        int actualDay = service.salesAboveAverage(arr);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void monthMinimumSales() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(arr);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}

