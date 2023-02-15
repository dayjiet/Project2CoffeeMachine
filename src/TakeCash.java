public class TakeCash {
    public static void takeCash() {

        System.out.println("I gave you $" + CoffeeMachine.remainingCash);
        System.out.println();
        int remainingCash = 0;

        CoffeeMachine.coffeeMachine(remainingCash);
        ShowCoffeeMachineMenu.showCoffeeMachineMenu();
    }
}
