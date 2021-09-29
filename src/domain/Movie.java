package domain;

public class Movie extends Product {
    public Movie(String title, String id) {
        super(title, id);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
