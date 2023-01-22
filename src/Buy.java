public class Buy {
    public enum CoffeeStatus {
        ONE, TWO, THREE, BACK;

        public static CoffeeStatus getCoffeeStatus(String coffeeType) {
            switch (coffeeType) {
                case "1":
                    return ONE;
                case "2":
                    return TWO;
                case "3":
                    return THREE;
                case "back":
                    return BACK;
            }
            throw new IllegalStateException("Unexpected value: " + coffeeType);
        }
    }
    public static void buy(String coffeeType) {
        Buy.CoffeeStatus active = Buy.CoffeeStatus.valueOf(CoffeeStatus.getCoffeeStatus(coffeeType).name());

        switch (active) {
            case ONE:
                Espresso.espresso();
                break;
            case TWO:
                Latte.latte();
                break;
            case THREE:
                Cappuccino.cappuccino();
                break;
            case BACK:
                System.out.println();

                Action.action();
            default:
                break;
        }
    }
}
