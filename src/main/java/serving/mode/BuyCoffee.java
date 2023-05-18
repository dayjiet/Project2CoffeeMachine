package serving.mode;

import serving.base.ShowCoffeeMachineMenu;

public class BuyCoffee {
    public enum CoffeeStatus {
        ONE, TWO, THREE, BACK;

        public static CoffeeStatus getCoffeeStatus(String coffeeType) {
            switch (coffeeType) {
                case "1" -> {
                    return ONE;
                }
                case "2" -> {
                    return TWO;
                }
                case "3" -> {
                    return THREE;
                }
                case "back" -> {
                    return BACK;
                }
            }
            throw new IllegalStateException("Unexpected value: " + coffeeType);
        }
    }

    /**
     * Method takes the coffee type as input and makes the coffee by calling the appropriate coffee method
     */
    public static void buyCoffee(String coffeeType) {
        BuyCoffee.CoffeeStatus active = BuyCoffee.CoffeeStatus.valueOf(CoffeeStatus.getCoffeeStatus(coffeeType).name());

        switch (active) {
            case ONE:
                BuyEspresso.buyEspresso();
                break;
            case TWO:
                BuyLatte.buyLatte();
                break;
            case THREE:
                BuyCappuccino.buyCappuccino();
                break;
            case BACK:
                System.out.println();

                ShowCoffeeMachineMenu.showCoffeeMachineMenu();
            default:
                break;
        }
    }
}
