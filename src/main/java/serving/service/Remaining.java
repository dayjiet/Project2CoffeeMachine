package serving.service;

import serving.dao.Data;
import serving.view.Menu;

/**
 * The ShowRemaining class provides a utility method for displaying the remaining resources and cash in the
 * coffee machine.
 */
public class Remaining {
    /**
     * Displays the current status of the coffee machine, including the remaining amounts of water, milk, coffee beans,
     * disposable cups, and money.
     */
    public static void show() {

        System.out.println("The coffee machine has:");
        System.out.println(Data.remainingWater + " ml of water");
        System.out.println(Data.remainingMilk + " ml of milk");
        System.out.println(Data.remainingCoffee + " g of coffee beans");
        System.out.println(Data.remainingCups + " disposable cups");
        System.out.println("$" + Data.remainingCash + " of money");
        System.out.println();

        Menu.show();
    }
}
