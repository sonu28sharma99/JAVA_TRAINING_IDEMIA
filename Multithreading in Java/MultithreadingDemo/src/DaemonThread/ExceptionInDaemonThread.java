package DaemonThread;

// User defined thread
class myThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("This is myThread1");
    }
}


public class ExceptionInDaemonThread {
    public static void main(String[] args) {

        // creating object of thread
        myThread1 t1 = new myThread1();
        t1.start();
        t1.setDaemon(true);
    }
}
// Note : throws an exception
// b/c before starting a thread we have to use setDaemon Otherwise exception is thrown by JVM