package serving.service;

/**
 * The BuyEspresso class represents the process of buying an espresso from the coffee machine.
 * It subtracts the required amount of resources for making one cup of espresso.
 * If there are not enough resources, the machine returns an error message and asks to perform an action.
 */
public class Espresso {

    /**
     * Subtracts the required amount of resources for making one cup of espresso.
     * If there are not enough resources, the machine returns an error message and asks to perform an action.
     */
    public static void buy() {
        int waterForCup = 250;
        int milkForCup = 0;
        int coffeeForCup = 16;
        int cup = 1;
        int cost = 4;

        IsEnoughResources.check(waterForCup, milkForCup, coffeeForCup, cup, cost);
    }
}
