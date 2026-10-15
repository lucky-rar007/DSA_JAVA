package chai_code.ArraysAndHashing;

import java.util.HashSet;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] input={1,1,2,2,3,3};
        HashSet<Integer> set=new HashSet<>(input.length);
        for(int i:input){
            set.add(i);
        }
        System.out.println(Math.min(set.size(), input.length / 2));
    }
}
