

class Thread1 extends Thread{
    @Override
    public void run() {

            try{
                    for(int i = 1; i <= 10; i++) {
                        Thread1.sleep(2000);
                        System.out.println(i + ". I'm Sonu Sharma");
                    }
            }catch (Exception et){
                System.out.println(et);
            }
    }
}


class Thread2 extends Thread{
    @Override
    public void run() {

        try{
            for(int i = 1; i <= 10; i++) {
                Thread2.sleep(1000);
                System.out.println(i + ". This is Laptop");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}



public class Test {
    public static void main(String[] args) {
        // creating object of threads
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
