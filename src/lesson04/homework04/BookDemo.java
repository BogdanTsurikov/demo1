package lesson04.homework04;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Савин Роман", "Общее Тестирование", 314,12,true);

        System.out.println(book1.author);
        book1.author();
        System.out.println(book1.BookTitle);
        book1.BookTitle();
        System.out.println(book1.PagesBook);
        book1.PagesBook();
        System.out.println(book1.CatNumber);
        book1.CatNumber();
        System.out.println(book1.BookInVault);
        book1.BookInVault();

    }

}
