package MergeIntervals;
import java.util.*;
public class MeetingRooms {
    static void main(String[] args) {
        System.out.println(minMeetingRooms(new int[]{2, 9, 6},new int[]{4, 12, 10}));
    }
    static int minMeetingRooms(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        int curr = 0;
        int max = 0;
        int ptr = 0;
        for(int i = 0; i < start.length; i++){
            while(ptr < end.length && end[ptr] <= start[i]){
                ptr++;
                curr--;
            }
            curr++;
            max = Math.max(max, curr);
        }

        return max;
    }
}
