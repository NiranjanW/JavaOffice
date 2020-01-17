package org.lcbo;
public class VeggiePizza extends Pizza {

    VeggiePizza(){
           name = "Veggie Pizza";
           dough = "Crust";
           sauce = "Marinara sauce";
           toppings.add("Shredded mozzarella");
           toppings.add("Grated parmesan");
           toppings.add("Diced onion");
           toppings.add("Sliced mushrooms");
           toppings.add("Sliced red pepper");
           toppings.add("Sliced black olives");
    }
    
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza");
        // TODO Auto-generated method stub

    }

}