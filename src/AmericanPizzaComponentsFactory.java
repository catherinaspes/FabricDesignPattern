public class AmericanPizzaComponentsFactory implements PizzaComponentsFactory {
    @Override
    public Dough createDough() {
        return new ThickFluffyDough();
    }

    @Override
    public Sauce cerateSouce() {
        return new TomatoeSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Vegetables[] createVegetables() {

        Vegetables []vegetables = {new Spinach(), new EggPlant(), new BlackOlives()};
        return vegetables;
    }



    @Override
    public Clams createClams() {
        return new FreezedClams();
    }
}
