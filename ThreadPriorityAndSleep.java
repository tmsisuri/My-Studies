class A extends Thread {
    public void run() {
        for(int i=1; i<=50; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread {
    public void run() {
        for(int i=1; i<=50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadPriorityAndSleep {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        //get priority
        System.out.println(obj1.getPriority());

        //set priority (1 to 10 or constants priority like MAX_PRIORITY , MIN_PRIORITY , NORM_PRIORITY)
        obj1.setPriority(Thread.NORM_PRIORITY);
        
        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
