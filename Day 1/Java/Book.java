public class Book {

    String title;
    String author;

    void display() {
        System.out.println(title);
        System.out.println(author);
    }

    public static void main(String[] args) {

        Book b1 = new Book();

        b1.title = "Java Basics";
        b1.author = "James";

        b1.display();
    }
}