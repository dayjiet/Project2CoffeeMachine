public class Remaining {
    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(CoffeeMachine.remainingWater + " ml of water");
        System.out.println(CoffeeMachine.remainingMilk + " ml of milk");
        System.out.println(CoffeeMachine.remainingCoffee + " g of coffee beans");
        System.out.println(CoffeeMachine.remainingCups + " disposable cups");
        System.out.println("$" + CoffeeMachine.remainingCash + " of money");
        System.out.println();

        Action.action();
    }
}
