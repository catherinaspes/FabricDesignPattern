public class ItalianPizzaComponentsFactory implements PizzaComponentsFactory {

    @Override
    public Dough createDough() {
        return new ThinCrunchyDough();
    }

    @Override
    public Sauce cerateSouce() {
        return new MarinaraSouce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggioCheese();
    }

    @Override
    public Vegetables [] createVegetables() {
        Vegetables [] vegetables = {new Garlic(), new Onion(), new RedPepper()};

        return vegetables;
    }


    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
