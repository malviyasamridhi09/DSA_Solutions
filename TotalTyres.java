import java.util.*;

public class TotalTyres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int cars = sc.nextInt();
            int bikes = sc.nextInt();

            int totalTyres = cars * 4 + bikes * 2;
            System.out.println(totalTyres);
        }
    }
}