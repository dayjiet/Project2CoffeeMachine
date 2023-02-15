public class CheckIfEnoughResources {

    /**
     * Method checks if there are enough resources for a coffee cup with given ingredients and cost of the coffee.
     * Prints a success message if there are enough resources and updates the remaining resources
     * and cash of the coffee machine accordingly. If there are not enough resources for the coffee cup,
     * prints a message indicating which resource is not enough and returns to the main menu.
     */
    public static void checkIfEnoughResources(int waterForCup, int milkForCup, int coffeeForCup, int cup, int cost) {
        int remainingWaterAfter = CoffeeMachine.remainingWater - waterForCup;
        int remainingMilkAfter = CoffeeMachine.remainingMilk - milkForCup;
        int remainingCoffeeAfter = CoffeeMachine.remainingCoffee - coffeeForCup;
        int remainingCupsAfter = CoffeeMachine.remainingCups - cup;

        if (remainingWaterAfter < 0) {
            System.out.println("Sorry, not enough water!");
            System.out.println();

            ShowCoffeeMachineMenu.showCoffeeMachineMenu();
        } else if (remainingMilkAfter < 0) {
            System.out.println("Sorry, not enough milk!");
            System.out.println();

            ShowCoffeeMachineMenu.showCoffeeMachineMenu();
        } else if (remainingCoffeeAfter < 0) {
            System.out.println("Sorry, not enough coffee!");
            System.out.println();

            ShowCoffeeMachineMenu.showCoffeeMachineMenu();
        } else if (remainingCupsAfter < 0) {
            System.out.println("Sorry, not enough cups!");
            System.out.println();

            ShowCoffeeMachineMenu.showCoffeeMachineMenu();
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            int remainingWater = CoffeeMachine.remainingWater - waterForCup;
            int remainingMilk = CoffeeMachine.remainingMilk - milkForCup;
            int remainingCoffee = CoffeeMachine.remainingCoffee - coffeeForCup;
            int remainingCups = CoffeeMachine.remainingCups - cup;
            int remainingCash = CoffeeMachine.remainingCash + cost;

            CoffeeMachine.coffeeMachine(remainingWater, remainingMilk, remainingCoffee, remainingCups, remainingCash);
            ShowCoffeeMachineMenu.showCoffeeMachineMenu();
        }
    }
}
