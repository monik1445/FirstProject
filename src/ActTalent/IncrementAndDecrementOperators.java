package ActTalent;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        int x = 100;
        int y = x++;    // post increment = first assign and then increment +
        int z = ++x;    // pre increment = increment and then assign

        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);

        int a = 100;
        int b = a--;    // post increment = first assign and then decrement
        int c = --a;    // pre increment = decrement and then assign

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);

        int n1 = 100;
        int n2, n3;
        n2 = ++n1;
        n3 = n1++ + --n2;

        System.out.println("Value of n1 is: " + n1);
        System.out.println("Value of n2 is: " + n2);
        System.out.println("Value of n3 is: " + n3);

    }
}
