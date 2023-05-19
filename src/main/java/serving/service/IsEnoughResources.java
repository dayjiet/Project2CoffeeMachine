package serving.service;

import serving.dao.Data;
import serving.view.Menu;

/**
 * The CheckIfEnoughResources class provides a utility method for checking if there are enough resources to make
 * a coffee cup with given ingredients and cost of the coffee.
 */
public class IsEnoughResources {

    /**
     * Checks if there are enough resources for a coffee cup with given ingredients and cost of the coffee.
     * If there are enough resources, it prints a success message, updates the remaining resources and cash of the
     * coffee machine, and returns to the main menu. If there are not enough resources for the coffee cup, it prints
     * a message indicating which resource is not enough and returns to the main menu.
     * @param waterForCup the amount of water required for one cup of coffee
     * @param milkForCup the amount of milk required for one cup of coffee
     * @param coffeeForCup the amount of coffee beans required for one cup of coffee
     * @param cup the number of cups to be made
     * @param cost the cost of the coffee
     */
    public static void check(int waterForCup, int milkForCup, int coffeeForCup, int cup, int cost) {
        int remainingWaterAfter = Data.remainingWater - waterForCup;
        int remainingMilkAfter = Data.remainingMilk - milkForCup;
        int remainingCoffeeAfter = Data.remainingCoffee - coffeeForCup;
        int remainingCupsAfter = Data.remainingCups - cup;

        if (remainingWaterAfter < 0) {
            System.out.println("Sorry, not enough water!");
            System.out.println();

            Menu.show();
        } else if (remainingMilkAfter < 0) {
            System.out.println("Sorry, not enough milk!");
            System.out.println();

            Menu.show();
        } else if (remainingCoffeeAfter < 0) {
            System.out.println("Sorry, not enough coffee!");
            System.out.println();

            Menu.show();
        } else if (remainingCupsAfter < 0) {
            System.out.println("Sorry, not enough cups!");
            System.out.println();

            Menu.show();
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            int remainingWater = Data.remainingWater - waterForCup;
            int remainingMilk = Data.remainingMilk - milkForCup;
            int remainingCoffee = Data.remainingCoffee - coffeeForCup;
            int remainingCups = Data.remainingCups - cup;
            int remainingCash = Data.remainingCash + cost;

            Data.store(remainingWater, remainingMilk, remainingCoffee, remainingCups, remainingCash);
            Menu.show();
        }
    }
}
