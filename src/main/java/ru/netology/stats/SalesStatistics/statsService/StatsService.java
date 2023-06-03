package ru.netology.stats.SalesStatistics.statsService;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж ,больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int calculateSumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(long[] sales) {

        return calculateSumSales(sales) / sales.length;
    }

    public int salesBelowAverage(long[] sales) {
        int minMonth = 0; // количество месяцев, в которых продажи были ниже среднего

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < calculateSumSales(sales) / sales.length) {
                minMonth = i;
            }

        }
        return minMonth;
    }

    public int salesAboveAverage(long[] sales) {
        int maxMonth = 0; // количество месяцев, в которых продажи были выше среднего
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > calculateSumSales(sales) / sales.length) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

}

