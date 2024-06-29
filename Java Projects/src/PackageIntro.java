//import toolbox.tools.Tool1;
//import toolbox.tools.Tool2;

//or simply:
import toolbox.tools.*; //this imports everything from the tools folder
//don't confuse with toolbox.*; which would import all classes from the toolbox package and not all its sub-packages.

public class PackageIntro
{
    public static void main(String[] args)
    {
        Tool1 obj = new Tool1();
        int add = obj.add(1, 5);
        System.out.println(add);

        Tool2 obj1 = new Tool2();
        int sub = obj1.sub(6, 3);
        System.out.println(sub);
    }
}

// By default, every java file has java.lang imported
// That's why we can use classes like System, String, etc., without importing them manually