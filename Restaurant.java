package com.company;

public class Restaurant {
    String name;
    int numberMenuDishes;
    String address;
    int tablesQuantity;
    private int waitersQuantity;
    private int cooksQuantity;
    private int restaurantProfit;
    private String ownerName;
    private int averageDishPrice;
    protected String openingTime;
    protected String closingTime;
    public static int counter;

    public static void printStaticCounter() {
        System.out.println(Restaurant.counter);
    }

    public void printCounter() {
        System.out.println(Restaurant.counter);
    }

    public void SetWaitersQuantity(int waitersQuantity) {
        this.waitersQuantity = waitersQuantity;
    }

    public void SetCooksQuantity(int cooksQuantity) {
        this.cooksQuantity = cooksQuantity;
    }

    public void SetRestaurantProfit(int restaurantProfit) {
        this.restaurantProfit = restaurantProfit;
    }

    public void SetOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void SetAverageDishPrice(int averageDishPrice) {
        this.averageDishPrice = averageDishPrice;
    }

    public int GetWaitersQuantity() {
        return waitersQuantity;
    }

    public int GetCooksQuantity() {
        return cooksQuantity;
    }

    public int GetRestaurantProfit() {
        return restaurantProfit;
    }

    public String GetOwnerName() {
        return ownerName;
    }

    public int GetAverageDishPrice() {
        return averageDishPrice;
    }

    public void setValues(String name, int numberMenuDishes, String address, int tablesQuantity, int waitersQuantity,
                          int cooksQuantity, int restaurantProfit, String ownerName, int averageDishPrice, String openingTime,
                          String closingTime) {
        this.name = name;
        this.numberMenuDishes = numberMenuDishes;
        this.address = address;
        this.tablesQuantity = tablesQuantity;
        this.waitersQuantity = waitersQuantity;
        this.cooksQuantity = cooksQuantity;
        this.restaurantProfit = restaurantProfit;
        this.ownerName = ownerName;
        this.averageDishPrice = averageDishPrice;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public Restaurant() {
        this(null, 0, null, 0, 0, 0, 0, null, 0, null, null);
    }

    public Restaurant(int waitersQuantity, int cooksQuantity, int restaurantProfit, String ownerName) {
        this(null, 0, null, 0, waitersQuantity, cooksQuantity, restaurantProfit, ownerName, 0, null, null);
    }

    public Restaurant(String name, int numberMenuDishes, String address, int tablesQuantity, int waitersQuantity,
                      int cooksQuantity, int restaurantProfit, String ownerName, int averageDishPrice, String openingTime,
                      String closingTime) {
        setValues(name, numberMenuDishes, address, tablesQuantity, waitersQuantity, cooksQuantity, restaurantProfit,
                ownerName, averageDishPrice, openingTime, closingTime);
        counter++;
    }

    @Override
    public String toString() {
        return "Restaurant name -" + this.name + "\nNumber of dishes on the menu - " + this.numberMenuDishes
                + "\nAddress - " + this.address + "\nQuantity of tables - " + this.tablesQuantity
                + "\nQuantity of waiters - " + this.waitersQuantity + "\nQuantity of cooks - "
                + this.cooksQuantity + "\nProfit of the restaurant - " + this.restaurantProfit
                + "\nName of the owner" + this.ownerName + "\nAverage price of a dish - " + this.averageDishPrice
                + "\nOpening time - " + this.openingTime + "\nClosing time - " + this.closingTime;
    }

}
