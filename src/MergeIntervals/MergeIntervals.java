package MergeIntervals;
import java.util.*;
public class MergeIntervals {
    static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})));
    }
    static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int[] a;
        int[] b;
        for(int i=0;i<intervals.length-1;i++){
            a=intervals[i];
            b=intervals[i+1];
            if(b[0]<=a[1]){
                intervals[i+1][0]=a[0];
                intervals[i+1][1]=Math.max(a[1],b[1]);
            }
            else {
                list.add(new int[]{a[0], a[1]});
            }
        }
        list.add(intervals[intervals.length-1]);
        return list.toArray(new int[list.size()][]);
    }
}
