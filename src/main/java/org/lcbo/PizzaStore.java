package org.lcbo;
public class PizzaStore {
Pizza pizza;

 public static void main(String[] args) {
    
    Pizza pizza = SimplePizzaFactory.orderPizza("veggie");
      System.out.println("\nPizza ready : "+ pizza.name);
}

}