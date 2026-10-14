package chai_code.ArraysAndHashing;

import java.util.HashSet;

public class LargestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    public static int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int v:nums){
            set.add(v);
        }
        int best=0;
        for(int n:set){
            if(set.contains(n-1)){
                continue;
            }else{
                int length=1;
                while(set.contains(n+length)){
                    length++;
                }
                best = Math.max(best, length);
            }
        }
        return best;
    }
}
