package pizza;

import java.util.List;

public class ThaiPizza extends  Pizza{

    private double cost;
    private List<String> components;

    public ThaiPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.THAI);
    }
}
