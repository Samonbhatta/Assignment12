import java.util.InputMismatchException;
import java.util.Scanner;

public class part2 {
    public static void main(String [] args){

        int sum =0;
        int value=0;
        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.println( "Please enter a number" );
                value = input.nextInt();
                sum = sum + value;
            }
            catch (InputMismatchException e){
                System.out.println( "Input error. Please enter a number again" );
                input.next();
            }


        } while (value!=0);
        System.out.println( "The sum of the entered number is " + sum );
    }
}

