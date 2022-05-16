package BitManipulation;

/**
 * Find the non-repeating element in an array where all the other elements repeats twice.
 */
public class NonRepeating_1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1,6,7,7};
        int res = 0;
        for (int n : arr) {
            res = res ^ n;
        }

        System.out.println(res);
    }
}
