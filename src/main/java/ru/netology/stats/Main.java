package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sumAllSales = service.sumAllSales(sales);
        System.out.println("1. Сумма всех продаж = " + sumAllSales);

        long averageSales = service.averageSales(sales);
        System.out.println("2. Средняя сумма продаж в месяц = " + averageSales);

        long maxSales = service.maxSales(sales);
        System.out.println("3. Номер месяца, в котором был пик продаж  = " + maxSales);

        long minSales = service.minSales(sales);
        System.out.println("4. Номер месяца, в котором был минимум продаж = " + minSales);

        long sumMonthsBelowAverageSales = service.sumMonthsBelowAverageSales(sales);
        System.out.println("5. Кол-во месяцев, в которых продажи были ниже среднего = " + sumMonthsBelowAverageSales);

        long sumMonthsAboveAverageSales = service.sumMonthsAboveAverageSales(sales);
        System.out.println("6. Кол-во месяцев, в которых продажи были выше среднего = " + sumMonthsAboveAverageSales);


    }
}
