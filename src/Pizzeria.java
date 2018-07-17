public abstract class Pizzeria {


    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.preparing();
        pizza.baking();
        pizza.sliceing();
        pizza.packing();
        return pizza;

    }
    abstract Pizza createPizza(String type);


}
