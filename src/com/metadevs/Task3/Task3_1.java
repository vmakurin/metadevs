package com.metadevs.Task3;

public class Task3_1 {
    public static void main(String[] args) {
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        int randomMonth = (int) (Math.random() * months.length);
        String stringMonth = months[randomMonth];
        System.out.println(stringMonth);
        switch (stringMonth) {
            case "Январь":
                System.out.println("Зима");
                break;
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Март":
                System.out.println("Весна");
                break;
            case "Апрель":
                System.out.println("Весна");
                break;
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
                System.out.println("Лето");
                break;
            case "Июль":
                System.out.println("Лето");
                break;
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
                System.out.println("Осень");
                break;
            case "Октябрь":
                System.out.println("Осень");
                break;
            case "Ноябрь":
                System.out.println("Осень");
                break;
            case "Декабрь":
                System.out.println("Зима");
                break;
            default:
                System.out.println("Ошибка");

        }
        if (stringMonth.equals(months[0]) || stringMonth.equals(months[1]) || stringMonth.equals(months[11])) {
            System.out.println("Зима");
        }
        if (stringMonth.equals(months[2]) || stringMonth.equals(months[3]) || stringMonth.equals(months[4])) {
            System.out.println("Весна");
        }
        if (stringMonth.equals(months[5]) || stringMonth.equals(months[6]) || stringMonth.equals(months[7])) {
            System.out.println("Лето");
        }
        if (stringMonth.equals(months[8]) || stringMonth.equals(months[9]) || stringMonth.equals(months[10])) {
            System.out.println("Осень");
        }
    }
}
