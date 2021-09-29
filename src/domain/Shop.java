package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        return new ArrayList<>(products.values());
    }

    public Double
}
