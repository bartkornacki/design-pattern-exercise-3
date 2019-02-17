package pizza;

import java.util.List;

public class PizzaFactory {
    public Pizza create(double cost, List<String> components, PizzaType pizzaType){
        if (pizzaType.equals(PizzaType.CAPRICIOSA)){
            return new CapriciosaPizza(123, null);
        }
        else if (pizzaType.equals(PizzaType.HAWAI)){
            return new HawaiPizza(1234, null);
        }
        else if (pizzaType.equals(PizzaType.MARHERITA)){
            return new MargheritaPizza(12345, null);
        }
        else if (pizzaType.equals(PizzaType.THAI)){
            return new ThaiPizza(123456, null);
        }
        return null;
    }
}
