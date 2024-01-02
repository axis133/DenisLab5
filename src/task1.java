public class task1 {
    public abstract class Book {
        protected String code;
        protected String author;
        protected String title;
        protected int year;
        protected String publisher;

        public Book(String code, String author, String title, int year, String publisher) {
            this.code = code;
            this.author = author;
            this.title = title;
            this.year = year;
            this.publisher = publisher;
        }

    }

    public class ReferenceBook extends Book {
        public ReferenceBook(String code, String author, String title, int year, String publisher) {
            super(code, author, title, year, publisher);
        }
    }

    public class Encyclopedia extends Book {
        public Encyclopedia(String code, String author, String title, int year, String publisher) {
            super(code, author, title, year, publisher);
        }
    }

}