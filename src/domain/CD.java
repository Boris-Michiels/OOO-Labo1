package domain;

public class CD extends Product {
    public CD(String title , String id) {
        super(title,id);
    }

    public CD(String title) {
        super(title);
    }

    @Override
    public double getPrice(int dagen) {
        return 1.5 * dagen;
    }
}
