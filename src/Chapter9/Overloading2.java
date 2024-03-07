package Chapter9;

public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMehotd(1.2, 2);
    }

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
    }

    public static void myMehotd(double a, int b){
        System.out.println("double a, int b");
    }
}
