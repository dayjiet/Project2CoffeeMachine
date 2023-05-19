package serving.dao;

/**
 * The StoreCoffeeMachineData class stores the remaining resources and cash in the coffee machine.
 * It provides methods for updating the values of the remaining resources and cash.
 */
public class Data {
    /**
     * The remaining amount of water in the coffee machine.
     */
    public static int remainingWater = 400;
    /**
     * The remaining amount of milk in the coffee machine.
     */
    public static int remainingMilk = 540;
    /**
     * The remaining amount of coffee beans in the coffee machine.
     */
    public static int remainingCoffee = 120;
    /**
     * The remaining number of disposable cups in the coffee machine.
     */
    public static int remainingCups = 9;
    /**
     * The remaining amount of cash in the coffee machine.
     */
    public static int remainingCash = 550;

    /**
     * Adds the specified amount of cash to the remaining cash in the coffee machine.
     * @param takenCash the amount of cash to add
     */
    public static void store(int takenCash) {
        remainingCash = takenCash;
    }

    /**
     * Adds the specified amount of water, milk, coffee beans, and cups to the respective remaining resources in the coffee machine.
     * @param filledWater the amount of water to add
     * @param filledMilk the amount of milk to add
     * @param filledCoffee the amount of coffee beans to add
     * @param filledCups the number of cups to add
     */
    public static void store(int filledWater, int filledMilk, int filledCoffee, int filledCups) {
        remainingWater = filledWater;
        remainingMilk = filledMilk;
        remainingCoffee = filledCoffee;
        remainingCups = filledCups;
    }

    /**
     * Stores the specified amounts of remaining resources and cash in the coffee machine.
     * @param checkedWater the remaining amount of water
     * @param checkedMilk the remaining amount of milk
     * @param checkedCoffee the remaining amount of coffee beans
     * @param checkedCups the remaining number of cups
     * @param checkedCash the remaining amount of cash
     */
    public static void store(int checkedWater, int checkedMilk, int checkedCoffee, int checkedCups, int checkedCash) {
        remainingWater = checkedWater;
        remainingMilk = checkedMilk;
        remainingCoffee = checkedCoffee;
        remainingCups = checkedCups;
        remainingCash = checkedCash;
    }
}