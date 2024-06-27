class Book
{
    String author;
    int price;
    static String publisher;

    public Book()
    {
        author = "Jimmy";
        price = 12;
        System.out.println("in constructor");
    }
    //the constructor gets called each time an instance of the class is created
    //the standard is to assign the vars in the constructor and not freely in th class
    //it initializes instance variables

    static
    {
        publisher = "Publishing Company";
        System.out.println("in static block");
    }
    //the static block gets called first and only once when the class is loaded
    //it initializes static variables
}

public class StaticBlock
{
    public static void main(String a[])
    {
        Book obj1 = new Book(); // class loading -> static block execution -> constructor call
        obj1.author = "Timmy Smith";
        obj1.price = 25;
        Book.publisher = "Publishing Company";

        Book obj2 = new Book(); //only constructor call
    }
}
