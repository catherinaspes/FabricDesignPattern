public class ItalianPizzeria extends Pizzeria {

    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaComponentsFactory pizzaComponentsFactory = new ItalianPizzaComponentsFactory();



        if(item.equals("cheese")){
            pizza = new CheesePizza(pizzaComponentsFactory);
            return pizza;

        } else if (item.equals("vegetarian")){
            pizza = new VegetarianPizza(pizzaComponentsFactory);
            return pizza;

        } else if (item.equals("seefood")){
            pizza =  new SeaFoodPizza(pizzaComponentsFactory);
            return pizza;
        }
        return pizza;
    }
}
