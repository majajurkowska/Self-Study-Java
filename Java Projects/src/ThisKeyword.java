class Animal {
    private String breed;
    private int age;

    public String getBreed() {
        return breed;
    }
    // getBreed() is a public method to access the private variable breed.
    // This method returns the value of the private variable breed.

    public void setBreed(String breed) {
        this.breed = breed;
        // "this.breed" refers to the instance variable breed of the current object.
        // The "this" keyword is used to distinguish between the instance variable and the local variable with the same name.
    }

    public int getAge() {
        return age;
    }
    // getAge() is a public method to access the private variable age.
    // This method returns the value of the private variable age.

    public void setAge(int age) {
        // age = age; // This doesn't work because it assigns the local variable to itself.
        // Without the "this" keyword, Java can't differentiate between the instance variable and the local variable.
        // "this" represents the current object.
        this.age = age;
        // "this.age" refers to the instance variable, while "age" refers to the local variable.
        // This assigns the value of the local variable age to the instance variable age.
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Animal dog = new Animal();
        // Creating an instance of the Animal class.

        dog.setAge(2);
        dog.setBreed("American Pit Bull Terrier");
        // Using setter methods to set the private variables.

        System.out.println(dog.getBreed() + ", Age: " + dog.getAge());
        // Using getter methods to access and print the private variables.
    }
}