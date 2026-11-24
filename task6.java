public class task6 {
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("ocean");
        Book b3=new Book("ocean", 1000);
        b1.display();
        b2.display();
        b3.display();

        
    }
    
}
class Book{
    String title;
    double price;
    Book(){
        title="unknown";
        price=0.0;
    }
    Book(String title){
        this.title=title;
        price=0.0;
    }
    Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    void display(){
        System.out.println("Book details");
        System.out.println("tilte : "+title);
        System.out.println("price : "+price);
    }

}
