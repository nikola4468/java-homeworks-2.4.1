package ru.netology.stats;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long summa = 0; // начальная сумма
        for (long sale : sales) { // sale число из каждой ячейки массива sales
            summa = summa + sale; // каждая сумма из предыдущей ячейки и следующей
        }
        return summa; // возвращает общую сумму
    }

    public long averageSales(long[] sales) {
        long summa = sumAllSales(sales); // получаем сумму за период
        int period = sales.length; // получаем период
        return summa / period; // возвращаем среднее значение за месяц
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // максимальная сумма за месяц
        int month = 0; // месяц
        for (long sale : sales) { // sale число из каждой ячейки массива sales
            if (sale >= sales[maxMonth]) { // если число в ячейке больше чем макс сумма в месяц, то
                maxMonth = month; // ячейка макс сумма получает значение этого месяца
            }
            month = month + 1; //счетчик месяца
        }
        return maxMonth + 1; // возвращает значение месяца
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1; // возвращает значение месяца
    }

    public int sumMonthsAboveAverageSales(long[] sales) {
        long average = averageSales(sales); // получаем среднее значение за месяц
        int month = 0; // месяц
        for (long sale : sales) { // sale число из каждой ячейки массива sales
            if (sale > average) { // если сумма за месяц больше среднего, то
                month = month + 1; // месяц +1
            }
        }
        return month; // возвращает сумму месяца
    }

    public int sumMonthsBelowAverageSales(long[] sales) {
        long average = averageSales(sales); // получаем среднее значение за месяц
        int month = 0; //месяц
        for (long sale : sales) { // sale число из каждой ячейки массива sales
            if (sale < average) { // если сумма за месяц меньше среднего, то
                month = month + 1; // месяц +1
            }
        }
        return month; // возвращает сумму месяца
    }
}
