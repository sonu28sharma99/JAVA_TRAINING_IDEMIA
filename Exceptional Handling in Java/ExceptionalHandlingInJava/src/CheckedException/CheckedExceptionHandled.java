package CheckedException;

import java.io.FileInputStream;

public class CheckedExceptionHandled {
    // Main driver method
    public static void main(String args[]) {

        try{
            FileInputStream FIS = new FileInputStream("/Desktop/FIS.txt");
        }catch(Exception e){
            System.out.println("File not found!");
            System.out.println(e);
        }

        System.out.println("Program run successfully!");
    }
}
