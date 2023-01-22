import java.util.Scanner;

public class Action {
    public enum CoffeeMachineStatus {
        BUY, FILL, TAKE, REMAINING, EXIT
    }
    public static void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();

        CoffeeMachineStatus active = CoffeeMachineStatus.valueOf(action.toUpperCase());

        switch (active) {
            case BUY:
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeeType = scanner.nextLine();

                Buy.buy(coffeeType);
                break;
            case FILL:
                System.out.println();
                System.out.println("Write how many ml of water you want to add:");
                int addWater = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int addMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addCoffee = scanner.nextInt();
                System.out.println("Write how many disposable cups you want to add:");
                int addCups = scanner.nextInt();
                System.out.println();

                Fill.fill(addWater, addMilk, addCoffee, addCups);
                break;
            case TAKE:
                System.out.println();

                Take.take();
                break;
            case REMAINING:
                System.out.println();

                Remaining.remaining();
                break;
            case EXIT:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + active);
        }
    }
}
