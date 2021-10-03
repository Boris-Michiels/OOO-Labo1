package domain;

public class Game extends Product {
    public Game(String title, String id) {
        super(title, id);
    }

    public Game(String title) {
        super(title);
    }

    @Override
    public double getPrice(int dagen) {
        return dagen * 3;
    }
}
