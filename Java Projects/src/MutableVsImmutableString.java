public class MutableVsImmutableString
{
    public static void main(String a[])
    {
        String name = "Navin";
        //this object is eligible for garbage collection to get some memory back, its reference is now unused

        name = name + " Reddy";
        //We are not changing the object name here,
        // instead it creates a new object and updates the REFERENCE number of the name variable
        // so now name just references another object of value "Navin Reddy"

        System.out.println(name);

        //Here we actually DO NOT have two objects, in fact, we have two references and just one object
        String s1 = "navin";
        String s2 = "navin";
        System.out.println(s1 == s2);

    }
}

//So Strings are IMMUTABLE and if we want a mutable one we need to use one of the classes StringBuffer or StringBuilder
//Those classes I will learn later