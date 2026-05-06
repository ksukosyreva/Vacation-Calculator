package ru.netology.services;
public class Main {
    public static void main(String[] args) {
        CalcVacationService service = new CalcVacationService();
        int income = 80_000;
        int expenses = 30_000;
        int threshold = 80_000;
        int numberMonth = 0;
        System.out.println("Месяцев отдыха: " + service.calculate(80_000, 30_000, 80_000));
    }
}
