package serving.service;

/**
 * The BuyCappuccino class represents the process of buying a cappuccino from the coffee machine.
 * It subtracts the required amount of resources for making one cup of cappuccino.
 * If there are not enough resources, the machine returns an error message and asks to perform an action.
 */
public class Cappuccino {

    /**
     * Subtracts the required amount of resources for making one cup of cappuccino.
     * If there are not enough resources, the machine returns an error message and asks to perform an action.
     */
    public static void buy() {
        int waterForCup = 200;
        int milkForCup = 100;
        int coffeeForCup = 12;
        int cup = 1;
        int cost = 6;

        IsEnoughResources.check(waterForCup, milkForCup, coffeeForCup, cup, cost);
    }
}
