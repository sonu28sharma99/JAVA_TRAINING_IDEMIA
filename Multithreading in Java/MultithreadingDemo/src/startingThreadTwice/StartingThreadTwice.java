package startingThreadTwice;

class myThread extends Thread{
    @Override
    public void run() {
        System.out.println("myThread is Started!!!");
    }
}

public class StartingThreadTwice {
    public static void main(String[] args) {

        // creating object of thread
        myThread t1 = new myThread();

        t1.start();
        t1.start(); // throws exception
        // Note:
        // Thread can't be started once goes to dead state
    }
}

