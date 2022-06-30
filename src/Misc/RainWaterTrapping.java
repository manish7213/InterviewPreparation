package Misc;

import java.util.Arrays;

public class RainWaterTrapping {

    public static void main(String[] args) {
//        int[] numbers = {4,2,0,3,2,5};
        int[] numbers = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int maxAccumulatedWater = findTrappedWater(numbers);
        int maxAccumulatedWater = findTrappedWaterOptimal(numbers);
        System.out.println(maxAccumulatedWater);
    }

    private static int findTrappedWaterOptimal(int[] numbers) {
        return 0;
    }

    private static int findTrappedWater(int[] numbers) {
        int[] left = new int[numbers.length];
        int[] right = new int[numbers.length];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            max1 = Math.max(max1, numbers[i]);
            left[i] = max1;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            max2 = Math.max(max2, numbers[i]);
            right[i] = max2;
        }

        for (int i = 0; i < numbers.length; i++) {
            res += Math.min(right[i], left[i]) - numbers[i];
        }

        System.out.println("Left Array is : {} " + Arrays.toString(left));
        System.out.println("Right Array is : {} " + Arrays.toString(right));

        return res;
    }

}
