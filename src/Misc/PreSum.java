package Misc;

import java.io.IOException;
import java.util.Arrays;

public class PreSum {

    public static void main(String[] args) throws IOException {
//        int[] nums =  {1,7,3,6,5,6};
//        int[] nums =  {2,1,-1};

        int[] nums =  {-1,1,3};
        int[] preSum = new int[nums.length];
        preSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(preSum));
        int res = findPivot(preSum);
        System.out.println(nums[res]);

    }

    private static int findPivot(int[] preSum) {
//[2,1,-1]
//[2,3,2]
        if (preSum[preSum.length - 1] - preSum[0] == 0) {
            return 0;
        }

        if (preSum[preSum.length - 2] == 0 ) {
            return preSum.length - 1;
        }
        for (int i = 1; i < preSum.length - 1; i++) {
            if (preSum[i - 1] == preSum[preSum.length - 1] - preSum[i]) {
                return i;
            }
        }

        return -1;
    }

}
