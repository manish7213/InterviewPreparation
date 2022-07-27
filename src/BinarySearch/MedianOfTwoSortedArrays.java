//package BinarySearch;
//
//public class MedianOfTwoSortedArrays {
//
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int n1 = nums1.length;
//        int n2 = nums2.length;
//        int i = 0;
//        int j = 0;
//        int count = 0;                             // 1 3
//        int res = -1;                              // 2
//        while(i < n1 && j < n2) {
//            if(nums1[i] < nums2[j]) {
//                if(count == (n1 + n2)/2) {
//                    return nums1[i+1];
//                }
//                i++;
//            } else {
//                if(count == (n1 + n2)/2) {
//                    return nums1[j+1];
//                }
//                j++;
//            }
//
//            count++;
//
//        }
//        return -1;
//
//    }
//}
