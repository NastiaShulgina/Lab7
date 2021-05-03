package com.company;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Puzata Hata", 45, "Rynok Square 66",
                25, 12, 10, 500000,
                "Andriy Andrusevych", 70, "08:00", "23:00");
        Restaurant restaurant2 = new Restaurant("Chelentano", 5, "Sykhiv district 55",
                1, 2, 3, 100,
                "Oksana Oksanyshyn", 25, "09:00", "22:00");
        Restaurant restaurant3 = new Restaurant("Cheese Bakery", 200, "Svobody Avenue",
                40, 30, 15, 1000000,
                "Petro Petrevych", 120, "07:00", "23:30");
        System.out.println(restaurant1);
        System.out.println(restaurant2);
        System.out.println(restaurant3);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Виведення статичного поля");
        restaurant1.printCounter();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Виведення статичного поля статичним методом");
        Restaurant.printStaticCounter();
    }
}