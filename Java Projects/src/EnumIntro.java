enum Status
{
    Running, Failed, Pending, Success
}
//This defines an enum named Status with four constants: Running, Failed, Pending, and Success.
//Each constant in an enum is implicitly public, static, and final.

public class EnumIntro
{
    public static void main(String[] args)
    {
        Status s = Status.Pending;

        //Enums can be used in switch statements, loops, and as fields in classes.
        switch (s)
        {
            case Running -> System.out.println("All good");
            case Failed -> System.out.println("Try again");
            case Pending -> System.out.println("Please wait");
            case Success -> System.out.println("Done");
        }

        /*
        for old switch statement:

        switch (s) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Success: //or default
                System.out.println("Done");
                break;
        }

        if(s == Status.Running)
            System.out.println("All good");
        else if(s == Status.Failed)
            System.out.println("Try again");
        else if(s == Status.Pending)
            System.out.println("Please wait");
        else
            System.out.println("Done");
         */
    }
}

//An enum (short for "enumeration") is a special data type that represents a group of constants.
// It is used to define a collection of predefined constants that are implicitly static and final.
// Enums are useful when you have a fixed set of related constants, such as days of the week, directions, or states.
