package Practice;

public class ExceptionExample {
    public static void main(String[] args) {

        try {
            int num1 = 16;
            int num2 = 32 / num1;
            System.out.println(num2);
        } catch (ArithmeticException e) { // this block is executed only when my error happens
            System.out.println("ERROR: Please dont do this knda math");
            e.printStackTrace();
        }
    }
}