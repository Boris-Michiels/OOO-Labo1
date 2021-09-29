package domain;

public abstract class Product {
    private String id;
    private String title;

    public Product(String title, String id) {
        this.id = id;
        this.title = title;
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
}
