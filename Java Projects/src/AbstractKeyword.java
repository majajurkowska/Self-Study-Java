abstract class Auto // abstract class
    //An abstract class cannot be instantiated directly. It serves as a blueprint for other classes.
    //It can have abstract methods (methods without implementation) and concrete methods (methods with implementation)
{
    public abstract void drive();
    public abstract void fly();
    //An abstract method does not have a body;
    // it is declared with the abstract keyword and a semicolon instead of a method body.

    //Subclasses must provide implementations for all abstract methods of the abstract class.

    public void playMusic()
    {
        System.out.println("Play Music");
    }
    // Concrete method that can be used by subclasses.
}

abstract class WagonR extends Auto //abstract class
{
    public void drive()
    {
        System.out.println("Driving");
    }
    // Implements the drive method, but still abstract because it doesn't implement all abstract methods from Auto.
}

class UpdatedWagonR extends WagonR //concrete class
{
    public void fly()
    {
        System.out.println("flying");
    }
    // Implements the remaining abstract method from Auto, making this class concrete.
}

public class AbstractKeyword
{
    public static void main(String[] args)
    {
        Auto obj = new UpdatedWagonR();
        // Can use a reference of the abstract class type to point to an instance of the concrete subclass.
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
