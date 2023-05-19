package serving.service;

import serving.dao.Data;
import serving.view.Menu;

/**
 * The Fill class provides a utility method for adding specified amounts of water, milk, coffee, and cups to the
 * coffee machine.
 */
public class Fill {

    /**
     * Adds the given amounts of water, milk, coffee, and cups to the coffee machine.
     * @param addWater the amount of water to be added
     * @param addMilk the amount of milk to be added
     * @param addCoffee the amount of coffee beans to be added
     * @param addCups the number of cups to be added
     */
    public static void fill(int addWater, int addMilk, int addCoffee, int addCups) {
        int remainingWater = Data.remainingWater+  addWater;
        int remainingMilk = Data.remainingMilk + addMilk;
        int remainingCoffee = Data.remainingCoffee + addCoffee;
        int remainingCups = Data.remainingCups + addCups;

        Data.store(remainingWater, remainingMilk, remainingCoffee, remainingCups);
        Menu.show();
    }
}
