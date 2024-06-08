class Counter {
    int count;
    //Synchronization in Java is the process that allows only one thread at a particular time to complete a given task entirely
    public synchronized void increment() {
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () ->
        {    
            for(int i=1 ; i<=10000 ; i++) {
                    c.increment();
                }   
        };
        Runnable obj2 = () ->
        {    
            for(int i=1 ; i<=10000 ; i++) {
                    c.increment();
                }   
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //Join method in Java allows one thread to wait until another thread completes its execution
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
