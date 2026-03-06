import java.util.*;

public class IntersectionArray {

    public static void main(String[] args){

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        Set<Integer> set = new HashSet<>();

        for(int num:nums1)
            set.add(num);

        Set<Integer> result = new HashSet<>();

        for(int num:nums2)
            if(set.contains(num))
                result.add(num);

        System.out.println(result);
    }
}