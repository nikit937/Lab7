public class Supplier implements interSupplier{

    public String Company;

    public Supplier(String company) {
        this.Company = company;
    }
    public String getComp() {
        return Company;
    }
    public void setComp(String company) {
        this.Company = company;
    }
    @Override
    public void bringBook(Book... books){
        System.out. println("Поставщик " + this.Company + " привез следующие книги " );
        for (Book book : books) {
            System.out.println(book.getName() + ",автор- " + book.getAuthor());
        }
        System.out.println();
    }

    }
