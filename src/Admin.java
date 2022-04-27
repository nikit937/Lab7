public class Admin implements interAdmin {
    public String fio;
    public Admin(String fio) {
        this.fio = fio;
    }

    @Override
    public void giveBook(Book... books) {
        System.out.println("Администратор " + this.fio + " выдал следующие книги");
        for (Book book : books) {
            System.out.println(book.getName() + ",автор- " + book.getAuthor());
        }
    }

    @Override
    public void warning(Reader... readers) {
        for (Reader reader : readers){
           if (reader.getDate() == true){
               System.out.println("Читатель " + reader.getFio() + " просрочил время возврата книг, необходимо уведомить по телефону " + reader.getPhone());
            }
           else {
               System.out.println("Читатель " + reader.getFio() +" просрочек не имеет");
           }
        }
    }
}
