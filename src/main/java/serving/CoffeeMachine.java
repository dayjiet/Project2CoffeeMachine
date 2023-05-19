package serving;

import serving.view.Menu;

/**
 * The CoffeeMachine class represents a coffee vending machine that allows users to perform various actions such as
 * buying coffee, filling resources, taking cash, and checking remaining resources.
 */
public class CoffeeMachine {

    /**
     * The main method starts the coffee vending machine application by displaying the coffee machine menu.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Menu.show();
    }
}