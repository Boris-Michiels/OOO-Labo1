package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private String naam;
    private Map<String, Product> products;

    public Shop(String naam) {
        setNaam(naam);
        this.products = new HashMap();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void addProduct(Product p) {
        this.products.put(p.getId(), p);
    }

    public Product getProduct(String id) {
        return this.products.get(id);
    }

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        for (Product p : this.products.values()) {
            if (p instanceof Movie) {
                products.add(p);
            }
        }
        for (Product p : this.products.values()) {
            if (p instanceof Game) {
                products.add(p);
            }
        }
        for (Product p : this.products.values()) {
            if (p instanceof CD) {
                products.add(p);
            }
        }
        return products;
    }

    public Double getPrice(String id, int dagen) {
        return this.products.get(id).getPrice(dagen);
    }
}
