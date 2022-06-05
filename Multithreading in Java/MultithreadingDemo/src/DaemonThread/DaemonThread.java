package DaemonThread;

class myThread extends Thread {
    @Override
    public void run() {
        boolean daemonThread = Thread.currentThread().isDaemon();

        if(daemonThread)
            System.out.println("daemon thread works");
        else
            System.out.println("user thread works");
    }
}

public class DaemonThread {
    public static void main(String[] args) {

        // creating objects of thread
        myThread thread1 = new myThread();

        // converting thread1 to daemon thread
        thread1.setDaemon(true);

        // starting thread1 i.e daemon thread
        thread1.start();
    }
}
