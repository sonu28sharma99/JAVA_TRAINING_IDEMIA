package ExceptionalHandling;

public class ExceptionObject {
    public static void main(String[] args) {
        try{
            int a = 100, b = 0, c = a / b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("We can provide custom messages here!!!");
            System.out.println("You can't divide integer by zero");
            System.out.println(e);
        }
//        if we did not handle risky code using try-catch then
        System.out.println("Note : this line doesn't executed!!!");
    }
}
