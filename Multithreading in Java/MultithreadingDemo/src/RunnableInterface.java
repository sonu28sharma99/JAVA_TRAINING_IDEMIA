public class RunnableInterface implements Runnable {

    // Here we have to declare thread task
    @Override
    public void run(){
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        RunnableInterface t = new RunnableInterface();
        Thread th = new Thread(t);
        th.start();

        System.out.println("Program run successfully!");
    }
}
