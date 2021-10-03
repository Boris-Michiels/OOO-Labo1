package domain;

import java.util.*;
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
        int count = products.values().size();
        p.setId(Integer.toString(count + 1));
        this.products.put(p.getId(), p);
    }

    public Product getProduct(String id) {
        return this.products.get(id);
    }

    public List<Product> getProducts() {
        return products.values().stream().sorted(new ProductComparator()).collect(Collectors.toList());
    }

    public Map<String, Product> getProductMap() {
        return products;
    }

    public void setProductMap(Map<String, Product> map) {
        this.products = map;
    }

    public Double getPrice(String id, int dagen) {
        return this.products.get(id).getPrice(dagen);
    }

    public void toggleAvailable(String id) {
        products.get(id).toggleAvailable();
    }
}
