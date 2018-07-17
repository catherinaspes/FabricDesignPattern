import java.util.Arrays;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;
    Vegetables [] vegetables;


    abstract void preparing();

    public void baking() {
        System.out.println("Pieczenie 25 min. w temp. 200 st. Celsjusza");
    }

    public void sliceing() {
        System.out.println("Krojenie na 8 kawałków");
    }

    public void packing() {
        System.out.println("Pakowanie w nasze firmowe pudełko");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", clams=" + clams +
                ", vegetables=" + Arrays.toString(vegetables) +
                '}';
    }
}
