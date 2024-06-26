class Human
{
    private int age;
    private String name;

    public int getAge() //getter
    {
        return age;
    }
    //getAge() is a public method to access the private variable age.
    //this method returns the value of the private variable age.

    public void setAge(int a) //setter
    {
        age = a;
    }
    //setAge(int a) is a public method to modify the private variable age.
    //this method sets the value of the private variable age.

    //we can also generate getters and setters using our IDE:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationGettersSetters
{
    public static void main(String a[])
    {
        Human person = new Human();
        //direct access to private variables is not allowed.
        //person.age = 63;
        //person.name = "Antonina";

        person.setAge(33);
        person.setName("Tommy");

        //direct access to private variables is not allowed.
        //System.out.println(person.name);

        System.out.println(person.getName() + " : " + person.getAge());
        //using public getter methods to access private variables.
    }
}
