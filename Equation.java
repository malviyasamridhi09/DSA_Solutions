import java.util.*;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = (int)Math.pow(a + b, 3);
        System.out.println(result);
    }
}