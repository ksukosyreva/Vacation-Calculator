package ru.netology.services;

public class CalcVacationService {
    public int calculate(int income, int expenses, int threshold) {
        int vacationMonths = 0;
        int money = 0;
        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");
            if (money >= threshold) {
                System.out.println("Буду отдыхать. Потратил -" + expenses + ", осталось -" + (money - expenses) / 3);
                vacationMonths++;
                money = (money - expenses) / 3;
            } else {
                System.out.println("Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        return vacationMonths;
    }
}
