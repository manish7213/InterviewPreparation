package BitManipulation;

public class IthBitOfNumber {
    public static void main(String[] args) {
//        n =      1 0 0 0
//        1 << 3 = 0 1 0 0
//  n & (1 << 3) = 0 0 0 0

         int n = 8;
         int i = 3;
         int mask = 1 << i;

         int res = n & mask;

        System.out.println(res);

    }
}
