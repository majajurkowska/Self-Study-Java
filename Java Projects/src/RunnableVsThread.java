public class RunnableVsThread
{
    public static void main(String[] args)
    {
        Runnable objA = () ->
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hi.");
                try{Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
            }
        };

        Runnable objB = () ->
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hello.");
                try{Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
            }
        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start(); // This starts the execution of TaskOne in a new thread
        t2.start(); // This starts the execution of TaskTwo in a new thread
    }
}

// Difference in use between Runnable and Thread:

// Runnable: Use Runnable when you want to separate the task from the thread management.
// This is useful if your class needs to extend another class, as it allows for more flexible and modular code design.

// Thread: Use Thread when you want to directly create a thread by extending the Thread class.
// This approach is simpler for quick and straightforward tasks
// but less flexible if you need to inherit from another class or interface.