package UncheckedException;

public class DivideByZeroExceptionHandled {
        public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int z = x / y;

            System.out.println("The value of z is " + z);
        } catch (Exception e) {
            // We can also print custom messages here
            System.out.println("Divide by zero error");
            System.out.println(e);
        }

        // If exception is properly handled
        // then below line will be printed
        System.out.println("Program successfully executed by Sonu Sharma - Associate Software Engineer");

    }
}
