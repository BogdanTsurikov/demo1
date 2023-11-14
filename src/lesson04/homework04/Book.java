package lesson04.homework04;

public class Book {
     String author;
     String BookTitle;
     int PagesBook;
     int CatNumber;
     boolean BookInVault;

    public Book(String author, String bookTitle,int PagesBook,int CatNumber,boolean bookInVault) {
        this.author = author;
        this.BookTitle = bookTitle;
        this.PagesBook = PagesBook;
        this.CatNumber = CatNumber;
        this.BookInVault = bookInVault;
    }


    public void author() {
        System.out.println( "Имя автора : " + author);
    }

    public void BookTitle() {
        System.out.println("Название книги - " + BookTitle);
    }

    public void PagesBook() {
        System.out.println("Количество страниц = "  + PagesBook);
    }
    public void CatNumber() {
        System.out.println("Номер в Каталоге - "  + CatNumber);

    }

    public boolean BookInVault() {
        System.out.println("на руках или в Хранилище " + BookInVault);

        return false;
    }
}


