

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static int add = 0;

    public static int add() throws InputMismatchException {
        int value =1;

        do {
            System.out.println("Please enter a number for addition");

            try {
                value = keyboard.nextInt();
                add += value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input you must enter a decimal number.");


                keyboard.next();
            }

        } while (value != 0);
        keyboard.close();
        return add;

    }

    public static void main(String[] args) {
        try {
            System.out.println(" The sum is: " + add());
            keyboard.close();
        } catch (InputMismatchException e) {
            keyboard.next();

        }

    }
}