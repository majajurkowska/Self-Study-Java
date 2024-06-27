class Alien
{
    private String planet;
    private int age;

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien() // default constructor
    {
        planet = "Neptune";
        age = 743;
    }
    // The default constructor initializes the instance variables to default values.
    // This constructor is called when no arguments are passed while creating an object of the Alien class.

    public Alien(String p, int a) // parameterized constructor
    {
        planet = p;
        age = a;
    }
    // The parameterized constructor initializes the instance variables to the values provided in the parameters.
    // This constructor is called when arguments are passed while creating an object of the Alien class.
}

public class DefaultVsParameterizedConstructor
{
    public static void main(String a[])
    {
        Alien obj = new Alien();
        Alien obj1 = new Alien("Venus", 345);

        System.out.println(obj.getPlanet() + ", " + obj.getAge());
        System.out.println(obj1.getPlanet() + ", " + obj1.getAge());
    }
}
