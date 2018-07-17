public class AmericanPizzeria extends Pizzeria {

    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaComponentsFactory pizzaComponentsFactory = new AmericanPizzaComponentsFactory();

        if(item.equals("cheese")){
            pizza =  new CheesePizza(pizzaComponentsFactory);
            return pizza;
        } else if (item.equals("vegetarian")){
            pizza = new VegetarianPizza(pizzaComponentsFactory);
            return pizza;
        } else if (item.equals("seefood")){
            pizza = new SeaFoodPizza(pizzaComponentsFactory);
            return pizza;
        }
       return pizza;


      /*  if(item.equals("cheese")){
            return new AmericanCheesePizza();
        } else if (item.equals("vegetarian")){
            return new AmericanVegePizza();
        } else if (item.equals("seefood")){
            return new AmericanSeeFoodPizza();
        }
        else return null; */
    }
}
