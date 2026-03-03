import java.util.*;

public class FindFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = Math.abs(n);

        if (n == 0) {
            System.out.println("No Factors");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                if (i != n) {
                    System.out.print(",");
                }
            }
        }
    }
}