public class Fill {

    /**
     * Method adds given amounts of water, milk, coffee and cups to the coffee machine
     */
    public static void fill(int addWater, int addMilk, int addCoffee, int addCups) {
        int remainingWater = StoreCoffeeMachineData.remainingWater+  addWater;
        int remainingMilk = StoreCoffeeMachineData.remainingMilk + addMilk;
        int remainingCoffee = StoreCoffeeMachineData.remainingCoffee + addCoffee;
        int remainingCups = StoreCoffeeMachineData.remainingCups + addCups;

        StoreCoffeeMachineData.coffeeMachine(remainingWater, remainingMilk, remainingCoffee, remainingCups);
        ShowCoffeeMachineMenu.showCoffeeMachineMenu();
    }
}
