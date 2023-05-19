package serving.view;

import serving.service.Espresso;
import serving.service.Latte;
import serving.service.Cappuccino;

/**
 * The BuyCoffee class represents the process of buying a coffee from the coffee machine.
 * It takes the coffee type as input and makes the coffee by calling the appropriate coffee method.
 */
public class Coffee {
    /**
     * Enum representing the available coffee types: ONE, TWO, THREE, BACK.
     */
    public enum CoffeeStatus {
        ONE, TWO, THREE, BACK;

        /**
         * Retrieves the CoffeeStatus enum value based on the given coffee type.
         * @param coffeeType the coffee type as a String
         * @return the corresponding CoffeeStatus enum value
         * @throws IllegalStateException if the coffee type is unexpected or not supported
         */
        public static CoffeeStatus get(String coffeeType) {
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
     * Makes the coffee based on the given coffee type.
     * It calls the appropriate coffee method.
     * @param coffeeType the coffee type as a String
     */
    public static void buy(String coffeeType) {
        Coffee.CoffeeStatus active = Coffee.CoffeeStatus.valueOf(CoffeeStatus.get(coffeeType).name());

        switch (active) {
            case ONE:
                Espresso.buy();
                break;
            case TWO:
                Latte.buy();
                break;
            case THREE:
                Cappuccino.buy();
                break;
            case BACK:
                System.out.println();

                Menu.show();
            default:
                break;
        }
    }
}
