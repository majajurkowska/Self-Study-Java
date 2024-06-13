public class LogicalOperators {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        boolean logicalAnd = b && a;
        System.out.println(logicalAnd);
        //logical AND will not check the second argument, since b being false means the whole expression is false

        boolean logicalOr = a || b;
        System.out.println(logicalOr);
        //logical OR will not check the second argument, since a being true means the whole expression is true

        boolean logicalNot = !a;
        System.out.println(logicalNot);

        //there is also XOR but will be discussed later
        //those are bitwise operators but will have it here:

        boolean bitwiseAnd = b & a;
        System.out.println(bitwiseAnd);
        //bitwise AND checks all arguments, even though b being false already means the whole expression is false

        boolean bitwiseOr = a | b;
        System.out.println(bitwiseOr);
        //bitwise OR checks all arguments, even though a being true already means the whole expression is true
    }
}
