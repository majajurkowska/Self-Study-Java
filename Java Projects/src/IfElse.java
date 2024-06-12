public class IfElse {
    public static void main(String[] args) {

        int x = 18;
        int y = 8;
        int z = 7;

        if(x<10)
            System.out.println("Hello."); //also works without the indentation
        //here no brackets, because just one statement
        else
            System.out.println("Bye.");

        if(x>y)
        {
            System.out.println("Hi");
            System.out.println("There.");
        } //with multiple statements we have to use curly brackets
        else
            System.out.println("Goodbye.");
    }
}
