package ExceptionInJava;

public class ExceptionExampleInJava {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = x / y;

        // If exception found then below line is not printed
        System.out.println("The value of z is " + z);
    }
}
