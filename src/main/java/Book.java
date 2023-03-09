public class Book extends Product {
    private String bookTitle; /** сохраняет название книги */
    private String bookAuthor; /** сохраняет имя автора */

    public Book(int prodId, String prodName, int prodPrice, String bookTitle, String bookAuthor) {
        super(prodId, prodName, prodPrice);
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }
}
