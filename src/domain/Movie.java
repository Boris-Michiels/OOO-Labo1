package domain;

public class Movie extends Product {
    public Movie(String title, String id) {
        super(title, id);
    }

    @Override
    public double getPrice(int dagen) {
        double price = 5;
        if (dagen < 3) return price;
        else return price + (dagen - 3) * 1.5;
    }
}
