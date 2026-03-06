import java.util.*;

public class SecondElements {
    public static void main(String[] args){

        int[] arr = {1,2,4,7,7,5};

        Arrays.sort(arr);

        if(arr.length < 2){
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest : -1");
            return;
        }

        System.out.println("Second Smallest : " + arr[1]);
        System.out.println("Second Largest : " + arr[arr.length-2]);
    }
}