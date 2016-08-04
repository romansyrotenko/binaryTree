package ReadInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInput {

    private Scanner scanner;

    public ReadInput() {
        this.scanner = new Scanner(System.in);
    }

    public int readNumber(String item) {

        int number = 0;
        boolean repeat = true;

        System.out.println("Enter " + item + ":");

        while(repeat) {
            try {
                number = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Please, enter valid " + item);
            }
            finally {
                scanner.nextLine();
            }
        }
        return number;
    }

}
