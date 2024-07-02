package food;

import food.fruits.*;

class Honeycrisp extends Apple
{
    public void abc()
    {
        System.out.println(country);
    }
}

public class AccessModifiers
{
    public static void main(String[] args)
    {
        Apple obj = new Apple();
        System.out.println(obj.seeds);
        //Since Apple and AccessModifiers classes are not in the same package the var seeds needs to be public
        //If you want something to work outside the package always make it public
        obj.show();
        //This works because the show method is public
        //Public means it can be accessed from anywhere


        Banana obj1 = new Banana();
        System.out.println(obj1.peels);
        //Because Banana and AccessModifiers classes are in the same package the var peels doesn't need to be public

        //System.out.println(obj1.color); - is private and doesn't work even in the same package
    }
}

//Public - can be used from anywhere
//Same class; Same package subclass; Same package non-subclass; Different package subclass; Different package non-subclass

//Private
//Same class

//Default (generally shouldn't use)
//Same class; Same package subclass; Same package non-subclass

//Protected
//Same class; Same package subclass; Same package non-subclass; Different package subclass