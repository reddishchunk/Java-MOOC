
import java.util.ArrayList;


public class Data {
    private ArrayList<String> name;
    private ArrayList<Double> price;
    
    public Data() {
        this.name = new ArrayList<String>();
        this.price = new ArrayList<Double>();
    }
    
    public void addEntry(String name, double price) {
        this.name.add(name);
        this.price.add(price);
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.price;
    }
}

