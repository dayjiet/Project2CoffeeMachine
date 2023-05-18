package serving.mode;

import serving.util.CheckIfEnoughResources;

public class BuyLatte {

    /**
     * Method subtracts resources for making one cup of latte. If there are not enough resources,
     * the machine returns an error message and asks to perform an action
     */
    public static void buyLatte() {
        int waterForCup = 350;
        int milkForCup = 75;
        int coffeeForCup = 20;
        int cup = 1;
        int cost = 7;

        CheckIfEnoughResources.checkIfEnoughResources(waterForCup, milkForCup, coffeeForCup, cup, cost);
    }
}
