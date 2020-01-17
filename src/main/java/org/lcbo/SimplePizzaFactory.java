package org.lcbo;
public class SimplePizzaFactory {

    public static Pizza orderPizza ( String type) {

        Pizza pizza = null;

        if(type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equals("pepperonie")){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }

}