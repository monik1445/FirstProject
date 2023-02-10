package jan2023;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        System.out.println("Press 3 for Spanish");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("English is selected");
                break;
            case 2:
                System.out.println("French is selected");
                break;
            case 3:
                System.out.println("Spanish is selected");
                break;
            default:
                    System.out.println("Wrong Input");

        }

    }
}
