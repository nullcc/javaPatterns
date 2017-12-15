package patterns.iterator;

public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.add(new Page(1));
        book.add(new Page(2));
        book.add(new Page(3));
        book.add(new Page(4));
        book.add(new Page(5));

        IBookIterator bookIterator = book.iterator();
        while (bookIterator.hasNext()) {
            Page page = bookIterator.next();
            System.out.println("Page number: " + page.getPageNumber());
        }

    }
}
