package methodsInThread;

// Thread methods cover in this program
// 1. .currentThread();
// 2. .getName();
// 3. .setName();
// 4. .isAlive();
// 5. .start();

public class ThreadName extends Thread {
    @Override
    public void run() {
        System.out.println("thread task is executed by : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        Thread.currentThread().setName("Default thread of Java present in main method");
        System.out.println("Hello is printed by : " + Thread.currentThread().getName());

        ThreadName thread1 = new ThreadName();
        thread1.setName("Monu thread");

        ThreadName thread2 = new ThreadName();
        thread2.setName("Sonu thread");
        System.out.println("Main : " + Thread.currentThread().isAlive());
        System.out.println("Thread 1 " + thread1.isAlive());
        System.out.println("Thread 2 " + thread2.isAlive());
        System.out.println("Main : " + Thread.currentThread().isAlive());

        thread1.start();
        thread2.start();

        System.out.println();
        System.out.println("After started thread1 and thread2");
        System.out.println("Main : " + Thread.currentThread().isAlive());
        System.out.println("Thread 1 " + thread1.isAlive());
        System.out.println("Thread 2 " + thread2.isAlive());
        System.out.println("Main : " + Thread.currentThread().isAlive());


    }
}
