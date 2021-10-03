package domain;

public class CD extends Product {
    public CD(String title , String id) {
        super(title,id);
    }

    @Override
    public double getPrice(int dagen) {
        return 1.5 * dagen;
    }
}
