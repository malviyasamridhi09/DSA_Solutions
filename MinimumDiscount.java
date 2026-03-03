import java.util.*;

public class MinimumDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int minDiscount = Integer.MAX_VALUE;
        String minItem = "";

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(",");

            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int discountPercent = Integer.parseInt(parts[2]);

            int discountAmount = (price * discountPercent) / 100;

            if (discountAmount < minDiscount) {
                minDiscount = discountAmount;
                minItem = name;
            }
        }

        System.out.println(minItem);
    }
}