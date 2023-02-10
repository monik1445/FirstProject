package jan2023;

public class Loop {
    public static void main(String[] args) {
        // For Loop

        //    for (int i = 0; i <= 10; i--) {
        //        System.out.println("i = " + i);

        for (int i = 0; i <= 1000; i++) {
            if(i==6){
                break;
            }

            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
        }

    }
}