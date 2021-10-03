package domain;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
}


class ProductComparator implements Comparator<Product> {
    private Map<String, Integer> sort = Stream.of(new Object[][] {
            { "Movie", 1 },
            { "Game", 2 },
            { "CD", 3 },
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    @Override
    public int compare(Product p1, Product p2) {
        return sort.get(p1.getClass().getSimpleName()) - sort.get(p2.getClass().getSimpleName());
    }
}
