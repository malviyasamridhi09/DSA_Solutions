import java.util.*;

public class FindDuplicate {

    public static void main(String[] args){

        int[] arr = {1,3,4,2,2};

        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                System.out.println(num);
                break;
            }
        }
    }
}