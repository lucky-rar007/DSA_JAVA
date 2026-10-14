package chai_code.ArraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};

        int[] result = prefix(num);
        suffix(result, num);

        System.out.println(Arrays.toString(result));
    }

    public static int[] prefix(int[] nums) {
        int[] output = new int[nums.length];
        int pref = 1;

        for (int i = 0; i < nums.length; i++) {
            output[i] = pref;
            pref = pref * nums[i];
        }

        return output;
    }

    public static void suffix(int[] output, int[] nums) {
        int suff = 1;

        for (int i = output.length - 1; i >= 0; i--) {
            output[i] = output[i] * suff;
            suff = suff * nums[i];
        }
    }
}
