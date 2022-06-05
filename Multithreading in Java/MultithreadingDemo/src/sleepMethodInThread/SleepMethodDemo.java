package sleepMethodInThread;

class myThread extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.println(i + ". Sonu your Thread Started bro!!!");

            // Thread goes to sleeping state
            try{
                myThread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}


public class SleepMethodDemo {
    public static void main(String[] args) {

        // creating object of thread
        myThread thread1 = new myThread();
        thread1.start();
    }
}



