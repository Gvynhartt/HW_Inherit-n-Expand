public class ProductManager {
    private ProductRepository prodRepo;

    public ProductManager(ProductRepository prodRepo) {
        this.prodRepo = prodRepo;
    }

    public void addProductToRepo(Product productEntry) { /** добавляет объект продукта в репозиторий */
        Product[] productDatabase = prodRepo.getProductDatabase();
        Product[] bufferDatabase = new Product[productDatabase.length + 1];
        for (int pos = 0; pos < productDatabase.length; pos++) {
            bufferDatabase[pos] = productDatabase[pos];
        }
        bufferDatabase[bufferDatabase.length - 1] = productEntry;
        prodRepo.setProductDatabase(bufferDatabase);
    }

    public Product[] returnAllProductsInDB() { /** выводит все объекты продуктов, имеющиеся в репозитории */
        Product[] productDatabase = prodRepo.getProductDatabase();
        return productDatabase;
    }

    public void deleteFromDBbyID(int targetId) { /** удаляет объект продукта из репозитория по ID */
        Product[] productDatabase = prodRepo.getProductDatabase();

        int matchCount = 0;
        for (Product newProdEntry : productDatabase) {
            if (newProdEntry.getProdId() == targetId) {
                matchCount++;
            }
        }

        int pos = 0;
        int buffPos = 0;
        Product[] bufferDatabase = new Product[productDatabase.length - matchCount];
        for (Product newProdEntry : productDatabase) {
            if (newProdEntry.getProdId() != targetId) {
                bufferDatabase[buffPos] = productDatabase[pos];
                pos++;
                buffPos++;
            } else {
                pos++;
            }
        }
        prodRepo.setProductDatabase(bufferDatabase);
    }

    public Product[] searchByText(String queryText) { /*** сличает запрос с полем "prodName" и группирует найденные объекты продуктов в массив */
        Product[] productDatabase = prodRepo.getProductDatabase();
        Product[] bufferDatabase = new Product[productDatabase.length];
        int pos = 0;
        int matchCount = 0;

        for (Product targetProd : productDatabase) {
            if (targetProd.matchesQuery(queryText) == true) {
                bufferDatabase[pos] = targetProd;
                pos++;
                matchCount++;
            } else {
                pos++;
            }
        }

        Product[] resultDatabase = new Product[matchCount];
        int posResult = 0;
        pos = 0;

        for (pos = 0; pos < bufferDatabase.length; pos++) {
            if (bufferDatabase[pos] != null) {
                resultDatabase[posResult] = bufferDatabase[pos];
                posResult++;
            }
        }
        return resultDatabase;
    }
}