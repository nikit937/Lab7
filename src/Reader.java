public class Reader implements interReader {
    public String fio;
    private int number;
    private String phone;

    public boolean date;

    public Reader(String fio, int number, String phone, boolean date) {
        this.fio = fio;
        this.number = number;
        this.phone = phone;
        this.date = date;
    }

    @Override
    public void takeBook(Book... books){
        System.out. println(this.fio +" взял следующие книги ");
        for (Book book : books){
            System.out.println(book.getName()+ ",автор- "+ book.getAuthor());
        }
        System.out.println();
    }

    @Override
    public void returnBook(Book... books){
        System.out. println(this.fio +" вернул следующие книги ");
        for (Book book : books){
            System.out.println(book.getName()+ ",автор- "+ book.getAuthor());
        }
        System.out.println();
    }

    public boolean getDate() {
        return date;
    }
    public String getPhone() {
        return phone;
    }
    public String getFio() {
        return fio;
    }
}
