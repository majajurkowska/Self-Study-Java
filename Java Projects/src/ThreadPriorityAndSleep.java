class TaskOne extends Thread
{
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            System.out.println("Hi.");
            try{
                Thread.sleep(10); // Pause the thread for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Print the stack trace if an exception occurs
            }
        }
    }
}

class TaskTwo extends Thread
{
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            System.out.println("Hello.");
            try{
                Thread.sleep(10); // Pause the thread for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Print the stack trace if an exception occurs
            }
        }
    }
}

public class ThreadPriorityAndSleep
{
    public static void main(String[] args)
    {
        TaskOne objOne = new TaskOne();
        TaskTwo objTwo = new TaskTwo();

        // Get and print the priority of objOne thread (default priority is 5)
        // System.out.println(objOne.getPriority());

        // Set the priority of objTwo thread to the maximum priority (10)
        // objTwo.setPriority(Thread.MAX_PRIORITY);

        objOne.start(); // This starts the execution of TaskOne in a new thread
        objTwo.start(); // This starts the execution of TaskTwo in a new thread
    }
}
