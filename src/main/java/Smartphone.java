public class Smartphone extends Product {
    private String phoneModel; /** сохраняет название модели */
    private String phoneManufctr; /** сохраняет название производителя */

    public Smartphone(int prodId, String prodName, int prodPrice, String phoneModel, String phoneManufctr) {
        super(prodId, prodName, prodPrice);
        this.phoneModel = phoneModel;
        this.phoneManufctr = phoneManufctr;
    }

    public String getPhoneManufctr() {
        return phoneManufctr;
    }

    public boolean matchesQuery(String queryText) { /** отдельный метод для определения соответствия prodName запросу
     (ПЕРЕГРУЗКА ДЛЯ ДОЧЕРНЕГО КЛАССА "SMARTPHONE") */

        if (super.matchesQuery(queryText)) {
            return true;
        } else {
            if (getPhoneManufctr().contains(queryText)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
