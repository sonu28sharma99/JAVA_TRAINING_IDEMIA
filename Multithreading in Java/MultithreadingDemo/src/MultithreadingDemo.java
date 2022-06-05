public class MultithreadingDemo extends Thread {

    // We have to define thread task here i.e inside run method
    public void run() {
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        MultithreadingDemo t = new MultithreadingDemo();
        t.start();
        // We can't start thread again once it goes to dead state
        t.start();
    }
}
