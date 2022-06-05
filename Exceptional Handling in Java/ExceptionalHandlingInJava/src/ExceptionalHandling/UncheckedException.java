package ExceptionalHandling;

//public class UncheckedException {
//    public static void main(String[] args) {
//        int a = 100, b = 0, c;
//        c = a / b;
//
//        System.out.println(c);
//
////        System.out.println("hellow");
//    }
//}


public class UncheckedException{
    public static void main(String[] args) {
        int a = 100, b = 0, c;
        c = a / b;

        try{
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }

//        System.out.println("Sonu Sharma");
    }
}
