public class Librarian implements interLibrarian {
    public String fio, phone;
    public int order;

    public Librarian(String fio, String phone, int order) {
        this.fio = fio;
        this.phone = phone;
        this.order = order;
    }
    @Override
    public void orderBook(Book... books) {
        System.out.println("Библиотекарь " + this.fio +" заказал следующие книги " +  ", номер заказа " + order);
        for (Book book : books){
            System.out.println(book.getName()+ ",автор- "+ book.getAuthor());
        }
        System.out.println();
    }

    public void chooseSup(Supplier... suppliers) {
        for (Supplier supplier : suppliers){
            System.out.println("Библиотекарем по имени " + this.fio + " выбран поставщик " + supplier.getComp());
        }
        System.out.println();
    }

}
