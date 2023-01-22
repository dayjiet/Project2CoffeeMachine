public class Take {
    public static void take() {
        System.out.println("I gave you $" + CoffeeMachine.remainingCash);
        System.out.println();
        int remainingCash = CoffeeMachine.remainingCash - CoffeeMachine.remainingCash;

        CoffeeMachine.coffeeMachine(remainingCash);
        Action.action();
    }
}
