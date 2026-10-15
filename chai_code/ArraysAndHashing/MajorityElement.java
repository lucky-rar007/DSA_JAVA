package chai_code.ArraysAndHashing;

public class MajorityElement {
    public static void main (String[] args) {
        int[] nums = {3,2,3};
        int candidate=0;
        int count = 0;
        for(int num:nums){
            if(count==0){
                candidate = num;
            }
            if(candidate==num){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(candidate);
    }
}
