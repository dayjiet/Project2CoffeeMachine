package serving.util;

import serving.base.ShowCoffeeMachineMenu;
import serving.base.StoreCoffeeMachineData;

public class ShowRemaining {
    public static void showRemaining() {

        System.out.println("The coffee machine has:");
        System.out.println(StoreCoffeeMachineData.remainingWater + " ml of water");
        System.out.println(StoreCoffeeMachineData.remainingMilk + " ml of milk");
        System.out.println(StoreCoffeeMachineData.remainingCoffee + " g of coffee beans");
        System.out.println(StoreCoffeeMachineData.remainingCups + " disposable cups");
        System.out.println("$" + StoreCoffeeMachineData.remainingCash + " of money");
        System.out.println();

        ShowCoffeeMachineMenu.showCoffeeMachineMenu();
    }
}
