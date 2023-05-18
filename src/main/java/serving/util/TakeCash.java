package serving.util;

import serving.base.ShowCoffeeMachineMenu;
import serving.base.StoreCoffeeMachineData;

public class TakeCash {
    public static void takeCash() {

        System.out.println("I gave you $" + StoreCoffeeMachineData.remainingCash);
        System.out.println();
        int remainingCash = 0;

        StoreCoffeeMachineData.coffeeMachine(remainingCash);
        ShowCoffeeMachineMenu.showCoffeeMachineMenu();
    }
}
