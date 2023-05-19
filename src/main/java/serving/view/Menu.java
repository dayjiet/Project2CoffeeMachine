package serving.view;

import serving.service.Fill;
import serving.service.Remaining;
import serving.dao.Cash;

import java.util.Scanner;

/**
 * The ShowCoffeeMachineMenu class provides methods for displaying the coffee machine menu and handling user input.
 */
public class Menu {
    public enum CoffeeMachineStatus {
        BUY, FILL, TAKE, REMAINING, EXIT
    }

    /**
     * Displays the coffee machine menu options and prompts the user to select an option.
     * The method handles the selected option and performs the corresponding action.
     */
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.nextLine();

        CoffeeMachineStatus active = CoffeeMachineStatus.valueOf(action.toUpperCase());

        switch (active) {
            case BUY:
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeeType = scanner.nextLine();

                Coffee.buy(coffeeType);
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

                Cash.take();
                break;
            case REMAINING:
                System.out.println();

                Remaining.show();
                break;
            case EXIT:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + active);
        }
    }
}
