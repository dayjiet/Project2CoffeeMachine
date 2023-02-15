public class BuyCappuccino {

    /**
     * Method subtracts resources for making one cup of cappuccino. If there are not enough resources,
     * the machine returns an error message and asks to perform an action
     */
    public static void buyCappuccino() {
        int waterForCup = 200;
        int milkForCup = 100;
        int coffeeForCup = 12;
        int cup = 1;
        int cost = 6;

        CheckIfEnoughResources.checkIfEnoughResources(waterForCup, milkForCup, coffeeForCup, cup, cost);
    }
}
