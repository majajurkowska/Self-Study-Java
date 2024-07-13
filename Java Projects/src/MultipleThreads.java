// Task1 class defines a thread that prints "Hi."
class Task1 extends Thread
{
    // The run method contains the code that constitutes the new thread's task
    public void run()
    {
        // Loop to print "Hi." 100 times
        for (int i = 0; i <= 100; i++)
        {
            System.out.println("Hi.");
        }
    }
}

// Task2 class defines a thread that prints "Hello."
class Task2 extends Thread
{
    // The run method contains the code that constitutes the new thread's task
    public void run()
    {
        // Loop to print "Hello." 100 times
        for (int i = 0; i <= 100; i++)
        {
            System.out.println("Hello.");
        }
    }
}

public class MultipleThreads
{
    public static void main(String[] args)
    {
        // Create an instance of Task1
        Task1 obj1 = new Task1();
        // Create an instance of Task2
        Task2 obj2 = new Task2();

        // Start the Task1 thread
        obj1.start(); // This initiates the run method of Task1 in a separate thread
        // Start the Task2 thread
        obj2.start(); // This initiates the run method of Task2 in a separate thread
    }
}
