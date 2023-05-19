package serving.service;

/**
 * The BuyLatte class represents the process of buying a latte from the coffee machine.
 * It subtracts the required amount of resources for making one cup of latte.
 * If there are not enough resources, the machine returns an error message and asks to perform an action.
 */
public class Latte {

    /**
     * Subtracts the required amount of resources for making one cup of latte.
     * If there are not enough resources, the machine returns an error message and asks to perform an action.
     */
    public static void buy() {
        int waterForCup = 350;
        int milkForCup = 75;
        int coffeeForCup = 20;
        int cup = 1;
        int cost = 7;

        IsEnoughResources.check(waterForCup, milkForCup, coffeeForCup, cup, cost);
    }
}
