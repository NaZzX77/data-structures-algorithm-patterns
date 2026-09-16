package Heap.phase2;
import java.util.*;
public class KClosestPointstoOrigin {
    static void main(String[] args) {
        int[][] res=kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2);
        for(int i=0;i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }
    }
    static int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b) -> Integer.compare(b.distance,a.distance));
        for(int i=0;i<points.length;i++){
            int dis=((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
            pq.add(new pair(points[i],dis));
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            pair val=pq.poll();
            ans[i]=val.point;
        }
        return ans;
    }
}
class pair{
    int[] point;
    int distance;
    pair(int[] p,int d){
        point=p;
        distance=d;
    }
}
