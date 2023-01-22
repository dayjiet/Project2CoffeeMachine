public class ResourcesCheck {
    public static void resourcesCheck(int waterForCup, int milkForCup, int coffeeForCup, int cup, int cost) {
        int remainingWaterAfter = CoffeeMachine.remainingWater - waterForCup;
        int remainingMilkAfter = CoffeeMachine.remainingMilk - milkForCup;
        int remainingCoffeeAfter = CoffeeMachine.remainingCoffee - coffeeForCup;
        int remainingCupsAfter = CoffeeMachine.remainingCups - cup;

        if (remainingWaterAfter < 0) {
            System.out.println("Sorry, not enough water!");
            System.out.println();

            Action.action();
        } else if (remainingMilkAfter < 0) {
            System.out.println("Sorry, not enough milk!");
            System.out.println();

            Action.action();
        } else if (remainingCoffeeAfter < 0) {
            System.out.println("Sorry, not enough coffee!");
            System.out.println();

            Action.action();
        } else if (remainingCupsAfter < 0) {
            System.out.println("Sorry, not enough cups!");
            System.out.println();

            Action.action();
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            int remainingWater = CoffeeMachine.remainingWater - waterForCup;
            int remainingMilk = CoffeeMachine.remainingMilk - milkForCup;
            int remainingCoffee = CoffeeMachine.remainingCoffee - coffeeForCup;
            int remainingCups = CoffeeMachine.remainingCups - cup;
            int remainingCash = CoffeeMachine.remainingCash + cost;

            CoffeeMachine.coffeeMachine(remainingWater, remainingMilk, remainingCoffee, remainingCups, remainingCash);
            Action.action();
        }
    }
}
