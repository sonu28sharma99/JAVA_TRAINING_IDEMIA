package CheckedException;

import java.io.FileInputStream;
import java.util.Scanner;

public class FileNotFoundException extends Throwable {
    public static void main(String args[]) throws java.io.FileNotFoundException {
        FileInputStream GFG = new FileInputStream("/home/Scaler/Scaler.txt");
        //The file does’t present on its original location
        Scanner scan=new Scanner(System.in);

        //Taking the integer input in the variable
        int t=scan.nextInt();
        System.out.println(t);
    }
}


