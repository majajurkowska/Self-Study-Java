class Mobile
{
    String brand;
    int price;
    static String name; //belongs to the class and not to the object

    public void show()
    {
        System.out.println("brand: " + brand + " price: " + price + " name: " + name);
        //it is ok to use static vars in non-static methods
    }
}

public class StaticVariable
{
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        Mobile.name = "SmartPhone"; //better to call them with class name than object var (obj2.name)

        obj1.name = "Phone"; //changes the static variable for all objects because it's shared by all the objects
        //here im using obj1.name just to showcase how it's shared

        obj1.show();
        obj2.show();
    }
}
