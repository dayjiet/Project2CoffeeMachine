public class CheckIfEnoughResources {

    /**
     * Method checks if there are enough resources for a coffee cup with given ingredients and cost of the coffee.
     * Prints a success message if there are enough resources and updates the remaining resources
     * and cash of the coffee machine accordingly. If there are not enough resources for the coffee cup,
     * prints a message indicating which resource is not enough and returns to the main menu.
     */
    public static void checkIfEnoughResources(int waterForCup, int milkForCup, int coffeeForCup, int cup, int cost) {
        int remainingWaterAfter = StoreCoffeeMachineData.remainingWater - waterForCup;
        int remainingMilkAfter = StoreCoffeeMachineData.remainingMilk - milkForCup;
        int remainingCoffeeAfter = StoreCoffeeMachineData.remainingCoffee - coffeeForCup;
        int remainingCupsAfter = StoreCoffeeMachineData.remainingCups - cup;

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
            int remainingWater = StoreCoffeeMachineData.remainingWater - waterForCup;
            int remainingMilk = StoreCoffeeMachineData.remainingMilk - milkForCup;
            int remainingCoffee = StoreCoffeeMachineData.remainingCoffee - coffeeForCup;
            int remainingCups = StoreCoffeeMachineData.remainingCups - cup;
            int remainingCash = StoreCoffeeMachineData.remainingCash + cost;

            StoreCoffeeMachineData.coffeeMachine(remainingWater, remainingMilk, remainingCoffee, remainingCups, remainingCash);
            ShowCoffeeMachineMenu.showCoffeeMachineMenu();
        }
    }
}
