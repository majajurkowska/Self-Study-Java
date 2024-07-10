// Interface declaration
interface Computer //can't be instantiated
{
    int productionDate = 2024; //all variables in an interface are by default final and static

    void code(); // all Abstract methods that must be implemented by any class that implements this interface
    //methods inside an interface are by default public and abstract
}

//interface x extends Computer <- interfaces can extend interfaces

// Class implementing the Computer interface (classes can implement multiple interfaces)
class Laptop implements Computer//,Device
{
    // Providing implementation for the code method
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

// Another class implementing the Computer interface
class Desktop implements Computer
{
    // Providing implementation for the code method
    public void code()
    {
        System.out.println("code, compile, run, faster");
    }
}

// Developer class that uses the Computer interface
class Developer
{
    public void devApp(Computer obj)
    {
        obj.code(); // Calls the code method on the Computer object passed to it
    }
}

// Main class to run the example
public class InterfaceIntro
{
    public static void main(String[] args)
    {
        // Creating objects of Laptop and Desktop that implement the Computer interface
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        // Creating a Developer object
        Developer jessica = new Developer();
        jessica.devApp(desk); // Calls the code method on the Desktop object
        // jessica.devApp(lap); // Calls the code method on the Laptop object

        System.out.println(Computer.productionDate); //don't need an object to access the variable
    }
}

/*
class - class -> extends
class - interface -> implements
interface - interface -> extends

Types of interfaces:
SAM/Functional - 1 method
Normal - 2 or more methods
Marker - no methods
*/

