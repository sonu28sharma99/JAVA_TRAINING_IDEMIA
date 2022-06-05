package ThrowsKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
    void readFile() throws java.io.FileNotFoundException {
        FileInputStream fis = new FileInputStream("c:/abc.txt");
    }

    void saveFile() throws java.io.FileNotFoundException{
        String text = "this is demo";
        FileOutputStream fos = new FileOutputStream("c:/xyz.txt");
    }
}

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        ReadAndWrite rw = new ReadAndWrite();

        try{
            rw.readFile();
        }
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
