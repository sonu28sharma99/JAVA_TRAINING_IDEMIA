package ErrorInJava;

public class ErrorExampleInJava {
    public static void main(String[] args) {
        recursiveMethod(5);
        // if program ended successfully
        System.out.println("Program ended Successfully!");
    }

    public static void recursiveMethod(int i){
        while(i != 0){
            i++;
            recursiveMethod(i);
        }
    }
}

