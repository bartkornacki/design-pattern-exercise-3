package pizza;

import java.util.List;

public class PizzaFactory {
    public Pizza create(double cost, List<String> components, PizzaType pizzaType){
        if (pizzaType.equals(PizzaType.CAPRICIOSA)){
            return new CapriciosaPizza(cost, components);
        }
        else if (pizzaType.equals(PizzaType.HAWAI)){
            return new HawaiPizza(cost, components);
        }
        else if (pizzaType.equals(PizzaType.MARHERITA)){
            return new MargheritaPizza(cost, components);
        }
        else if (pizzaType.equals(PizzaType.THAI)){
            return new ThaiPizza(cost, components);
        }
        return null;
    }
}
