package BinarySearch;

/**
 * Given number of pages in n different books and m students. The books are arranged in ascending order of number of pages.
 * Every student is assigned to read some consecutive books.
 * The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.
 * <p>
 * Example :
 * <p>
 * Input : pages[] = {12, 34, 67, 90}
 * m = 2
 * Output : 113
 * Explanation:
 * There are 2 number of students. Books can be distributed
 * in following fashion :
 * 1) [12] and [34, 67, 90]
 * Max number of pages is allocated to student
 * 2 with 34 + 67 + 90 = 191 pages
 * 2) [12, 34] and [67, 90]
 * Max number of pages is allocated to student
 * 2 with 67 + 90 = 157 pages
 * 3) [12, 34, 67] and [90]
 * Max number of pages is allocated to student
 * 1 with 12 + 34 + 67 = 113 pages
 * <p>
 * Of the 3 cases, Option 3 has the minimum pages = 113.
 */
public class AllocateMinimumNumberOfPages_19 {

//    private static int allocatePages(int[] nums, int noOfStudents) {
//        int[] runningSum = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            runningSum[i] += nums[i];
//        }
//        binarySearch(runningSum,noOfStudents,)
//    }

//    public static void main(String[] args) {
//        int[] nums = {12, 34, 67, 90};
//        int noOfStudents = 2; // Expected Answer : 113
//        int res = allocatePages(nums, noOfStudents);
//    }

}
