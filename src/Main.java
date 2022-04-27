public class Main {
    public static void main(String[] args){
        Reader reader1 = new Reader("Аносов Андрей Владимирович", 231, "+79567435674", true);
        Reader reader2 = new Reader("Скородумов Леонид Олегович", 45, "+79034511211", false);
        Librarian librarian1 = new Librarian("Кузнецов Иван Геннадьевич", "+79786574322", 3);
        Supplier supplier1 = new Supplier("Топ-Книги");
        Admin admin1 = new Admin("Косолапов Петр Витальевич");
        Book book1 = new Book("Преступление и Наказание", "Достоевский");
        Book book2 = new Book("Гроза", "Осторовский");
        Book book3 = new Book("Отцы и Дети", "Грибоедов");
        Book book4 = new Book("Ревизор", "Гоголь");
        Book book5 = new Book("Код Да Винчи", "Браун");
        Book book6 = new Book("Три мушкетера", "Дюма");

        reader1.takeBook(book6);
        reader2.returnBook(book4);
        librarian1.chooseSup(supplier1);
        librarian1.orderBook(book1);
        supplier1.bringBook(book1);
        admin1.giveBook(book2,book3);
        admin1.warning(reader1);
        admin1.warning(reader2);

    }
}
