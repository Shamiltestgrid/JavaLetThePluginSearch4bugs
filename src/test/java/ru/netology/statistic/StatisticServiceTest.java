package ru.netology.statistic;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @org.junit.jupiter.api.Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 15};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
