
public class MissingNumber {

    public static void main(String[] args){

        int[] nums = {3,0,1};

        int n = nums.length;

        int sum = 0;

        for(int num : nums)
            sum += num;

        int total = n*(n+1)/2;

        System.out.println(total-sum);
    }
}