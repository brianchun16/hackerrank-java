package introduction;

public class Loops2 {
    public static void main(String [] args) {
        int a = 0;
        int b = 2;
        int n = 10;

        for (int j = 0; j < n; j++) {
            int result = a;

            for (int k = 0; k <= j; k++) {
                result = result + (int)Math.pow(2,k) * b;
            }

            System.out.println(result);
        }
    }
}
