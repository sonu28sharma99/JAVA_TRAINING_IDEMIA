package sleepMethodInThread;

public class SleepingMainThread {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){

            try{
                Thread.sleep(1000);
                System.out.println("Salaam bhai " + i);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

        System.out.println("Program executed successfully Sonu Bro!!!");
    }
}