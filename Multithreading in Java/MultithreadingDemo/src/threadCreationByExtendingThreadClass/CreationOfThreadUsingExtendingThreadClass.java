package threadCreationByExtendingThreadClass;

class myThread extends Thread{
    @Override
    public void run() {
        System.out.println("myThread started!!!");
    }
}

public class CreationOfThreadUsingExtendingThreadClass {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
    }
}
