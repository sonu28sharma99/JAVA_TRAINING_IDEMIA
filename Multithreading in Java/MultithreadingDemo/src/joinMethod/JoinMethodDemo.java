package joinMethod;

class thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(i + " sonu");
        }
    }
}

class thread2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(i + " monu");
        }
    }
}

class thread3 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(i + " suman");
        }
    }
}


public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();

        t1.start();

//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        t2.start();

//        try{
//            t2.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        t3.start();

//        try{
//            t3.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
    }
}
