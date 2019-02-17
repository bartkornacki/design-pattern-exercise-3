package pizza;

import java.util.List;

public abstract class Pizza {

    private double cost;
    private List<String> components;
    private PizzaType pizzaType;

    public Pizza(double cost, List<String> components, PizzaType pizzaType) {
        this.cost = cost;
        this.components = components;
        this.pizzaType = pizzaType;
    }
}
