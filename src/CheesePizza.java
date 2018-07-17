public class CheesePizza extends Pizza {

    PizzaComponentsFactory pizzaComponentsFactory;

    public CheesePizza(PizzaComponentsFactory pizzaComponentsFactory) {
        this.pizzaComponentsFactory = pizzaComponentsFactory;
    }

    @Override
    void preparing() {
        System.out.println("Przygotowanie: "+ name);
        dough = pizzaComponentsFactory.createDough();
        sauce = pizzaComponentsFactory.cerateSouce();
        cheese = pizzaComponentsFactory.createCheese();

    }

    @Override
    public void baking() {
        super.baking();
    }

    @Override
    public void sliceing() {
        super.sliceing();
    }

    @Override
    public void packing() {
        super.packing();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
