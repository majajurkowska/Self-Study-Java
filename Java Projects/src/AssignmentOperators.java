public class AssignmentOperators {
    public static void main(String[] args) {

        int x = 5;

        int y = 16;
        int z = 16;

        int a = 6;
        int b = 3;

        //basic assignment operators:

        x += 5; //same as x = x + 5
        System.out.println(x);

        x -= 8;
        System.out.println(x);

        x *= 12;
        System.out.println(x);

        x /= 4;
        System.out.println(x);

        x %= 5;
        System.out.println(x);

        //bitwise operators:

        //bitwise shift:
        y >>= 1;
        //shifts the bits of 16 one position to the right. In binary, 16 is 00010000.
        // After shifting one position to the right, it becomes 00001000, which is 8.
        System.out.println(y);

        z <<= 1;
        //shifts the bits of 16 one position to the left. In binary, 16 is 00010000.
        // After shifting one position to the left, it becomes 00100000, which is 32.
        System.out.println(z);

        // These are also:
        // &= (AND assignment), ^= (XOR assignment), |= (OR assignment)
        // They perform the bitwise operation on the variable and the specified value, then assign the result back to the variable.
        // &= (AND assignment): Combines the bits of the variable with the bits of another value using AND.
        // ^= (XOR assignment): Combines the bits of the variable with the bits of another value using XOR.
        // |= (OR assignment): Combines the bits of the variable with the bits of another value using OR.
        // Example: x &= y is equivalent to x = x & y
        // I will learn these operators in more detail later.
    }
}
