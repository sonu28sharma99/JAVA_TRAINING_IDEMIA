package typesOfMultithreadingUsingExtendingThreadClass;

// CREATING OUR THREAD
public class singleTaskFromMultipleThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("My task - 1");
    }

    public static void main(String[] args) {

        // INVOKING THREAD 1
        singleTaskFromMultipleThread thread1 = new singleTaskFromMultipleThread();
        thread1.start();

        // INVOKING THREAD 2
        singleTaskFromMultipleThread thread2 = new singleTaskFromMultipleThread();
        thread2.start();
    }
}


