// Performing Multiple Task from Multiple Thread
package typesOfMultithreadingUsingExtendingThreadClass;

// Thread no : 1
// ---------------------------------------------------
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread-1 task executed!");
    }
}

// Thread no : 2
// ----------------------------------------------------
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread-2 task executed!");
    }
}

// MAIN DRIVER PROGRAM
// ----------------------------------------------------
public class MultipleTaskfromMultipleThread {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        thread1.start();
        thread2.start();
    }
}
//-------------------------------------------------------------------------------------
//Note :
//Which thread has to be executed first is decided by the JVM (Java Virtual Machine).
//-------------------------------------------------------------------------------------




