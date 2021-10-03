package domain;

public abstract class Product {
    private String id;
    private String title;

    public Product(String title, String id) {
        setId(id);
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

    public abstract double getPrice(int dagen);

    @Override
    public String toString() {
        StringBuilder products = new StringBuilder();
        products.append("Categorie: ").append(getClass().getSimpleName()).append(" Id: ").append(getId()).append(" Omschrijving: ").append(getTitle());
        return products.toString();
    }
}
