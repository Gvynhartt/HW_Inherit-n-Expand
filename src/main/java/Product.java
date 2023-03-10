import java.util.Collection;

public class Product {

    protected int prodId;
    protected String prodName;
    protected int prodPrice;

    public Product(int prodId, String prodName, int prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public boolean matchesQuery(String queryText) { /** отдельный метод для определения соответствия prodName запросу
     (т. к. в первой задаче он был реализован одним блоком с методом, формирующим массив из выдачи) */
        if (getProdName().contains(queryText)) {
            return true;
        } else {
            return false;
        }
    }
}
