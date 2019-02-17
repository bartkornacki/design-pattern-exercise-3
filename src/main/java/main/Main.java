package main;

import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CapriciosaPizza capriciosaPizza = new CapriciosaPizza(31.99,Arrays.asList("cheese","champignons","ham"));
        HawaiPizza hawaiPizza = new HawaiPizza(29.99,Arrays.asList("cheese","pineaple","ham"));
        MargheritaPizza margheritaPizza = new MargheritaPizza(24, Arrays.asList("cheese"));

        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza capriciosaOne = pizzaFactory.create(123, Arrays.asList("cheese"), PizzaType.CAPRICIOSA);
        Pizza hawaiOne = pizzaFactory.create(1234, Arrays.asList("cheese"), PizzaType.HAWAI);
        Pizza margeritaOne = pizzaFactory.create(12345, Arrays.asList("cheese"), PizzaType.MARHERITA);
        Pizza thaiOne = pizzaFactory.create(123456, Arrays.asList("cheese"), PizzaType.THAI);


        capriciosaPizza.showPizzaInfo();
        hawaiPizza.showPizzaInfo();
        margheritaPizza.showPizzaInfo();


    }

}
