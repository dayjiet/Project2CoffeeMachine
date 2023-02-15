public class BuyEspresso {

    /**
     * Method subtracts resources for making one cup of espresso. If there are not enough resources,
     * the machine returns an error message and asks to perform an action
     */
    public static void buyEspresso() {
        int waterForCup = 250;
        int milkForCup = 0;
        int coffeeForCup = 16;
        int cup = 1;
        int cost = 4;

        CheckIfEnoughResources.checkIfEnoughResources(waterForCup, milkForCup, coffeeForCup, cup, cost);
    }
}
