
import java.util.ArrayList;


public class Data {
    private String name;
    private double price;
    
    public Data(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.price;
    }
}
