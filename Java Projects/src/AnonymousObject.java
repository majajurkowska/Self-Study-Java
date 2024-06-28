class A
{
    public A()
    {
        System.out.println("object created");
    }

    public void show()
    {
        System.out.println("in A show");
    }
}

public class AnonymousObject
{
    public static void main(String a[])
    {
        int marks;
        marks = 99;

        A obj; // Declaration of reference variable
        obj = new A(); // new A() is object creation
        // so if we wrote just new A() without assigning it a reference variable, that would be an ANONYMOUS OBJECT
        // we can't reuse anonymous objects because there is nothing for us to reference
        obj.show();

        // Example of an anonymous object
        new A().show();
        // Here, new A() creates an object of class A, and immediately calls the show() method on it.
        // This is an anonymous object because it is not assigned to any reference variable.
        // Anonymous objects can't be reused since they don't have a reference.
    }
}
