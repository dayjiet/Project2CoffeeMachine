package serving.dao;

import serving.view.Menu;

/**
 * The TakeCash class provides a utility method for withdrawing the cash from the coffee machine.
 */
public class Cash {
    /**
     * Withdraws the cash from the coffee machine and resets the remaining cash to zero. After the cash is withdrawn,
     * the coffee machine menu is displayed.
     */
    public static void take() {

        System.out.println("I gave you $" + Data.remainingCash);
        System.out.println();
        int remainingCash = 0;

        Data.store(remainingCash);
        Menu.show();
    }
}
