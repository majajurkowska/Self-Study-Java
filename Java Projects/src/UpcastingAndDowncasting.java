class A1 {
    public void show1() {
        System.out.println("in a1 show");
    }
    // Method in superclass A1
}

class B1 extends A1 {
    public void show2() {
        System.out.println("in b1 show");
    }
    // Method in subclass B1
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        /*
        double d = 4.5;
        int i = (int) d; // Typecasting - converting the type of the value

        System.out.println(i); // Outputs: 4
         */

        // Upcasting
        A1 obj = new B1(); // Upcasting: B1 object is cast to A1 reference
        obj.show1(); // This will call the show1 method of class A1

        // obj.show2(); // This line would cause a compile-time error because show2 is not defined in A1

        // Downcasting
        B1 obj1 = (B1) obj; // Downcasting: A1 reference is cast back to B1 reference
        obj1.show2(); // This will call the show2 method of class B1

        // It's important to ensure the object actually is an instance of the subclass
        if (obj instanceof B1) {
            B1 obj2 = (B1) obj; // Safe downcasting
            obj2.show2(); // This will call the show2 method of class B1
        }
    }
}
