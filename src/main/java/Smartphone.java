public class Smartphone extends Product {
    private String phoneModel; /** сохраняет название модели */
    private String phoneManufctr; /** сохраняет название производителя */

    public Smartphone(int prodId, String prodName, int prodPrice, String phoneModel, String phoneManufctr) {
        super(prodId, prodName, prodPrice);
        this.phoneModel = phoneModel;
        this.phoneManufctr = phoneManufctr;
    }
}
