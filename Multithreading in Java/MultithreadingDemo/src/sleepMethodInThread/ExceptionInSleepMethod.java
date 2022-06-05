package sleepMethodInThread;

class sonuThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i + " sonuThead executed!");

            try{
                sonuThread.sleep(-1000);   // negative value throws exception
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ExceptionInSleepMethod {
    public static void main(String[] args) {
        // creating object of sonuThread
        sonuThread thread1 = new sonuThread();
        thread1.start();

        System.out.println("Program executed successfully!!!");
    }
}



