import java.util.*;

public class MergeIntervals {
    public static void main(String[] args){

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]> result = new ArrayList<>();
        int[] prev = intervals[0];

        for(int i=1;i<intervals.length;i++){

            if(intervals[i][0] <= prev[1])
                prev[1] = Math.max(prev[1],intervals[i][1]);
            else{
                result.add(prev);
                prev = intervals[i];
            }
        }

        result.add(prev);

        for(int[] arr : result)
            System.out.println(Arrays.toString(arr));
    }
}