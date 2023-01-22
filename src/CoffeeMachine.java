public class CoffeeMachine {
    static int remainingWater = 400;
    static int remainingMilk = 540;
    static int remainingCoffee = 120;
    static int remainingCups = 9;
    static int remainingCash = 550;

    public static void coffeeMachine(int takenCash) {
        remainingCash = takenCash;
    }

    public static void coffeeMachine(int filledWater, int filledMilk, int filledCoffee, int filledCups) {
        remainingWater = filledWater;
        remainingMilk = filledMilk;
        remainingCoffee = filledCoffee;
        remainingCups = filledCups;
    }

    public static void coffeeMachine(int checkedWater, int checkedMilk, int checkedCoffee, int checkedCups, int checkedCash) {
        remainingWater = checkedWater;
        remainingMilk = checkedMilk;
        remainingCoffee = checkedCoffee;
        remainingCups = checkedCups;
        remainingCash = checkedCash;
    }
}