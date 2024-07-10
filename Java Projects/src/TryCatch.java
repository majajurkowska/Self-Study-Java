public class TryCatch
{
    public static void main(String[] args)
    {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try
        {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in the limit");
        }
        catch (Exception e) // Catches any other exceptions not caught by previous catch blocks
        {
            System.out.println("Something went wrong");
        }


        System.out.println(j);
        System.out.println("Bye");

    }
}

//if using multiple catch blocks, list more specific(child) exceptions before more general(parent) exceptions.
// This ensures that the appropriate catch block handles the specific exceptions first.
