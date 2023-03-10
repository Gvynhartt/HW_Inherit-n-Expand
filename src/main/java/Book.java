public class Book extends Product {
    private String bookTitle; /** сохраняет название книги */
    private String bookAuthor; /** сохраняет имя автора */

    public Book(int prodId, String prodName, int prodPrice, String bookTitle, String bookAuthor) {
        super(prodId, prodName, prodPrice);
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    @Override
    public boolean matchesQuery(String queryText) { /** отдельный метод для определения соответствия prodName запросу
     (ПЕРЕГРУЗКА ДЛЯ ДОЧЕРНЕГО КЛАССА "BOOK") */
        if (super.matchesQuery(queryText)) {
            return true;
        } else {
            if (getBookAuthor().contains(queryText)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
