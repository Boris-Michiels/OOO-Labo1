package domain;

public class CD extends Product {
    public static final int PRIJS = (int) 1.5;
    public CD(String title , String id){
        super(title,id);
    }

    @Override
    public double getPrice(int dagen) {
        return PRIJS *dagen;
    }
}
