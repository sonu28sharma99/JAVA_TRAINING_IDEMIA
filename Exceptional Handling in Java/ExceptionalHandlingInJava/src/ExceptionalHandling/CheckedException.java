package ExceptionalHandling;

import java.io.FileInputStream;

public class CheckedException {
//    public static void main(String[] args) {
//        FileInputStream fis = new FileInputStream("c:/abc.txt");
//
//        System.out.println("Sonu");
//    }


    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("c:/abc.txt");
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Sonu Sharma");
    }
}
