class Counter
{
    int count;

    // The synchronized keyword ensures that only one thread can execute this method at a time
    public synchronized void increment()
    {
        count++;
    }
}

public class RaceCondition
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter c = new Counter();

        Runnable obj1 = () ->
        {
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // The join method ensures that the main thread waits for t1 and t2 to finish
        t1.join();
        t2.join();

        // The expected output should be 20000 because each thread increments the counter 10000 times
        System.out.println(c.count);
    }
}

// Without the synchronized keyword and the join method, both of our threads would work on the same
// method/task at the same time, which would lead to a race condition. A race condition occurs when
// multiple threads access and modify shared data concurrently, leading to inconsistent or incorrect results.
// The synchronized keyword ensures that only one thread can execute the increment method at a time, preventing
// race conditions. The join method ensures that the main thread waits for both t1 and t2 to finish before
// printing the final count, ensuring that we see the complete result of all increments.
