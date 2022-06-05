package threadCreationUsingRunnableInterface;

public class CreationOfThreadUsingRunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Started!!!");
    }

    public static void main(String[] args) {
        CreationOfThreadUsingRunnableInterface t1 = new CreationOfThreadUsingRunnableInterface();
        Thread thread1 = new Thread(t1);
        thread1.start();
        System.out.println("Program run successfully");
    }
}


