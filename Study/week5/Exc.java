package week5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exc {
    public void test() {
        Scanner sc1 = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Please input an interger: ");
            String input = sc1.nextLine();
            Scanner sc2 = new Scanner(input);
            try {
                int n = sc2.nextInt();
                System.out.println("The interger is: " + n);
                isValid = true;
            } catch (InputMismatchException err) {
                System.out.println("Your input is invalid. ");
                System.out.println(err);
                isValid = false;
            }
            sc2.close();
        }
        sc1.close();
    }
}
