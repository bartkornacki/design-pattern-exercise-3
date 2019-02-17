package pizza;

import java.util.Arrays;
import java.util.List;

public class MargheritaPizza extends Pizza{
    private double cost;
    private List<String> components;

    public MargheritaPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.MARHERITA);
    }
}
