package lesson04.homework04;

public class BookShop {
    public static void main(String[] args) {
        Book book1 = new Book("Савин Роман", "Общее Тестирование", 314,12,true);
        Book book2 = new Book ("Александр Пушкин","Стихи",433,7,true);

        System.out.println(book1.author + book1.BookTitle);
        System.out.println(book2.author + book2.BookTitle + book2.PagesBook + book2.CatNumber + book2.BookInVault);
        System.out.println(book1.CatNumber + book1.PagesBook + book1.BookTitle);
        System.out.println(book1.author + book1.BookTitle + book1.PagesBook + book1.CatNumber + book1.BookInVault);

    }
}
