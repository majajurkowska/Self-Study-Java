public class WhileLoop {
    public static void main(String a[]) {

        /*
        int i = 1;

        while(i<=4) {
            System.out.println("Hi " + i);
            i++;
        }

        System.out.println("Bye " + i); //output gives bye 5 because after 1=4 it gets incremented and then checked
         */

        int i = 1;

        while (i <= 4) {
            System.out.println("Hi " + i);
            int j = 1;
            while (j<=3) {
                System.out.println("Hello " +j);
                j++;
            }

            i++;
        }

        System.out.println("Bye " + i);
    }
}
