public class TernaryOperator {
    public static void main(String a[]) {

        int n = 4;
        int result = 0;

        /*
        if(n%2==0)
            result = 10;
        else
            result = 20;

         Now that's how we can do this with a ternary operator ?:
        */

        result = n%2==0 ? 10 : 20;

        System.out.println(result);
    }
}
