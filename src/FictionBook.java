public class FictionBook extends Book {
    private String Category;

    public FictionBook() {
    }
    public FictionBook(String bookCode, String name, double price, String author, String Category) {
        super(bookCode, name, price, author);
        this.Category = Category;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
    @Override
    public double getPrice() {
        return super.getPrice()*0.93;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "Category='" + Category + '\'' +
                '}' + super.toString();
    }
}
