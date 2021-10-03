import ui.ShopUi;

public class ShopApp {
    public ShopApp() {

    }

    public static void main(String[] args) {
        ShopUi shopUi = new ShopUi();
        try {
            shopUi.ShowMenu();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
