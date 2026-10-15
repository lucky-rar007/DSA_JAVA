package chai_code.ArraysAndHashing;
import java.util.*;
public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> result=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        int[] res=new int[result.size()];
        int i=0;
        for(int num:result){
            res[i++]=num;
        }
        return res;
    }


    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int[] b={3,4,5,6,7};
        int[] result=intersection(a,b);
        System.out.println(Arrays.toString(result));
    }

}
