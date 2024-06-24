class Device
{
    String brand;
    int price;
    static String name;

    public void details()
    {
        System.out.println("brand: " + brand + " price: " + price + " name: " + name);
        //we can use both static and instance vars
    }
    //details() method is an instance method, meaning it belongs to an instance of the Device class.
    //To call it, you need to create an object of the Device class and use that object to call the method.

    public static void details1(Device obj)
    {
        System.out.println("in static method " + name + " " + obj.price);
        //we can use static vars directly,
        //but not instance vars like price or brand those can be used if there is an object reference
    }
    //details1() method is a static method, meaning it belongs to the class itself,
    //not to any particular instance of the class.
    //it can be called directly using the class name without creating an instance of the class.
}

public class StaticMethod
{
    public static void main(String a[])
    //the main method is static, so we can call it/run our program without the need for StaticMethod object
    {
        Device obj1 = new Device();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Device.name = "SmartPhone";

        Device obj2 = new Device();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        Device.name = "SmartPhone";

        obj1.details();
        obj2.details(); //calling an instance method on an object

        //Device.details(); will give an error "non-static method details() cannot be referenced from a static context"
        //but we can call the static method directly with the class name:

        //Device.details1();

        Device.details1(obj1);
    }
}