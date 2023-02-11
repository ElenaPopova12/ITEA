import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String name;
    private String color;
    private double prise;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrise() {
        return prise;
    }

    public Product(String name, String color, double prise) {
        this.name = name;
        this.color = color;
        this.prise = prise;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", prise=" + prise +
                '}';
    }

    public static void main(String[] args) {

        Product pr1 = new Product("t-shirt", "green", 55);
        Product pr2 = new Product("shorts", "white", 85);
        Product pr3 = new Product("skirt", "green", 100);

        List<Product> products = new ArrayList<>();

        products.add(pr1);
        products.add(pr2);
        products.add(pr3);

        System.out.println(products);
        List<Product> productsUpd = products.stream().filter(product -> product.getColor() == "green")
                .collect(Collectors.toList());
        List<Product> productsUpd1 = products.stream().filter(product -> product.getPrise() > 85)
                .collect(Collectors.toList());
        System.out.println(productsUpd);
        System.out.println(productsUpd1);
    }
}