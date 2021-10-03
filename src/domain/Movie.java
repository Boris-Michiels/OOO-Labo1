package domain;

public class Movie extends Product {
    public Movie(String title, String id) {
        super(title, id);
    }

    public Movie(String title) {
        super(title);
    }

    @Override
    public double getPrice(int dagen) {
        double price = 5;
        if (dagen <= 3) return price;
        else return price + (dagen - 3) * 2;
    }
}
