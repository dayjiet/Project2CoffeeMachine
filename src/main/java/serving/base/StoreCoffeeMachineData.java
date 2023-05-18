package serving.base;

public class StoreCoffeeMachineData {
    public static int remainingWater = 400;
    public static int remainingMilk = 540;
    public static int remainingCoffee = 120;
    public static int remainingCups = 9;
    public static int remainingCash = 550;

    /**
     * Method adds the specified amount of cash to the remaining cash,
     * then prompts the user to choose a type of coffee to buy
     * */
    public static void coffeeMachine(int takenCash) {
        remainingCash = takenCash;
    }

    /**
     * Method adds the specified amount of water, milk, coffee, and cups to the respective remaining resources
     */
    public static void coffeeMachine(int filledWater, int filledMilk, int filledCoffee, int filledCups) {
        remainingWater = filledWater;
        remainingMilk = filledMilk;
        remainingCoffee = filledCoffee;
        remainingCups = filledCups;
    }

    /**
     * Method stores the remaining amount of resources and cash in the machine
     */
    public static void coffeeMachine(int checkedWater, int checkedMilk, int checkedCoffee, int checkedCups, int checkedCash) {
        remainingWater = checkedWater;
        remainingMilk = checkedMilk;
        remainingCoffee = checkedCoffee;
        remainingCups = checkedCups;
        remainingCash = checkedCash;
    }
}