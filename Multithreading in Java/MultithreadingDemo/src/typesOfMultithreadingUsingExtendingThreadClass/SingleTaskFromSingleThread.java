
package typesOfMultithreadingUsingExtendingThreadClass;

public class SingleTaskFromSingleThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("My task i.e thread task");
    }

    public static void main(String[] args) {
        SingleTaskFromSingleThread thread = new SingleTaskFromSingleThread();
        thread.start();
    }
}






