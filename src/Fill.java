public class Fill {

    /**
     * Method adds given amounts of water, milk, coffee and cups to the coffee machine
     */
    public static void fill(int addWater, int addMilk, int addCoffee, int addCups) {
        int remainingWater = CoffeeMachine.remainingWater+  addWater;
        int remainingMilk = CoffeeMachine.remainingMilk + addMilk;
        int remainingCoffee = CoffeeMachine.remainingCoffee + addCoffee;
        int remainingCups = CoffeeMachine.remainingCups + addCups;

        CoffeeMachine.coffeeMachine(remainingWater, remainingMilk, remainingCoffee, remainingCups);
        ShowCoffeeMachineMenu.showCoffeeMachineMenu();
    }
}
