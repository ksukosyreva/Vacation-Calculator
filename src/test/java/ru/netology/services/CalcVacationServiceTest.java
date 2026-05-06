package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcVacationServiceTest {
    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/vocation.csv")
    public void testIncome10_000Rub (int expected, int income, int expenses, int threshold) {
        CalcVacationService service = new CalcVacationService();
        int actual = service.calculate(income,expenses,threshold);

        Assertions.assertEquals(expected, actual);
    }
//    @Test
//    public void testIncome100_000Rub () {
//        CalcVacationService service = new CalcVacationService();
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}

