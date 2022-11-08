package ActTalent;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstStr = sc.nextLine();
        System.out.println("You Entered: " + firstStr);

        int a = sc.nextInt();
        System.out.println("You Entered:" + a);
    }
}
