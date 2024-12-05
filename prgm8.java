
import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message){
        super(message);
    }
}

public class prgm8 {
    static double divide(int num, int den) throws DivisionByZeroException {
        if(den == 0){
            throw new DivisionByZeroException("Cannot Divide by Zero, idiot!");
        }
        return (double) num / den;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numerator and denominator: ");
        int numerator = input.nextInt();
        int decominato = input.nextInt();

        try {
            double result = divide(numerator, decominato);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e){
            System.out.println("Esception caught: " + e);
        } finally {
            System.out.println("Finally Block Executed!");
        }
    }
}
