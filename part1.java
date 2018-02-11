
import java.util.Scanner;

public class part1{
    public static void main(String [] args){

        int sum =0;
        int value=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println( "Please enter a number" );
            value =input.nextInt();
            sum=sum+value;


        } while (value!=0);
        System.out.println( "The sum of the entered number is " + sum );
    }
}




