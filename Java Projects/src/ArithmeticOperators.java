public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 6;
        int b = 5;

        int addition = a + b;
        System.out.println(addition);

        int subtraction = a - b;
        System.out.println(subtraction);

        int multiplication = a * b;
        System.out.println(multiplication);

        int division = a / b; //it will give the cushion
        System.out.println(division);

        int modulus = a % b; //it will give the reminder
        System.out.println(modulus);

        int postIncrement = a++; //it returns 6, but the var a becomes 7, first fetch then change
        System.out.println(postIncrement);

        int preIncrement = ++a; //returns 8 and var a is now 8, first change then fetch
        System.out.println(preIncrement);

        int postDecrement = b--; //it returns 5, but the var b becomes 4, first fetch then change
        System.out.println(postDecrement);

        int preDecrement = --b; //returns 3 and var b is now 3, first change then fetch
        System.out.println(preDecrement);
    }
}
