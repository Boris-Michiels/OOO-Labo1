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
        this.products.put(p.getId(), p);
    }

    public Product getProduct(String id) {
        return this.products.get(id);
    }

    public List<Product> getProducts() {
        /*List<Product> products = new ArrayList<>();
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
        return products;*/
        return products.values().stream().sorted(new ProductComparator()).collect(Collectors.toList());
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
        //if (p1.getClass() == p2.getClass()) return 0;
        return sort.get(p1.getClass().getSimpleName()) - sort.get(p2.getClass().getSimpleName());
    }
}
