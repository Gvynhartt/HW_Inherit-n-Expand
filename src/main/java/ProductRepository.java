public class ProductRepository {
    private Product[] productDatabase = new Product[0];

    public Product[] getProductDatabase() {
        return productDatabase;
    }

    public void setProductDatabase(Product[] productDatabase) {
        this.productDatabase = productDatabase;
    }
}
