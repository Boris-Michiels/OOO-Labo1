package domain;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private String id;
    private String title;
    private String description = "";
    private boolean available = true;

    public Product(String title, String id, boolean available) {
        setId(id);
        setTitle(title);
        setAvailable(available);
    }

    public Product(String title, String id) {
        setId(id);
        setTitle(title);
    }

    public Product(String title) {
        setTitle(title);
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void toggleAvailable() {
        available = !available;
    }

    public abstract double getPrice(int dagen);

    @Override
    public String toString() {
        StringBuilder products = new StringBuilder();
        products.append("Categorie: ").append(getClass().getSimpleName()).append("  Titel: ").append(getTitle()).append("  Id: ").append(getId()).append("  Omschrijving: ").append(getDescription());
        return products.toString();
    }
}
