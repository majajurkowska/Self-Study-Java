class C // Every class in Java extends the Object class
{
    public C()
    {
        super(); // Calls the constructor of the Object class (implicit and default)
        System.out.println("in C");
    }
    // Default constructor of class C
    // Calls the Object class constructor and prints "in C"

    public C(int n)
    {
        super(); // Calls the constructor of the Object class (implicit and default)
        System.out.println("in C int");
    }
    // Parameterized constructor of class C
    // Calls the Object class constructor and prints "in C int"
}

class D extends C
{
    public D()
    {
        super(); // Calls the default constructor of class C
        System.out.println("in D");
    }
    // Default constructor of class D
    // Calls the default constructor of class C and prints "in D"

    public D(int n)
    {
        this(); // Calls the default constructor of class D
        System.out.println("in D int");
    }
    // Parameterized constructor of class D
    // Calls the default constructor of class D and prints "in D int"
}

public class ThisAndSuperMethod
{
    public static void main(String[] args)
    {
        D obj = new D(5);
        // Calls the parameterized constructor of class D
        // This calls the default constructor of class D
        // Which in turn calls the default constructor of class C
    }
}
