package sliding_window_problem;

public class MaxSumSubarrayOfSizeK_2 {
    /*
    Problem Statement #
    Given an array of positive numbers and a positive number ‘k’, find the
    maximum sum of any contiguous subarray of size ‘k’.
     */
    public static double findMaxSumSubarray1(int k, int[] array){
        double windowSum = 0;
        double maxSum = 0;
        for(int windowStart = 0; windowStart < array.length; windowStart++){
            windowSum += array[windowStart];
            if(windowStart >= k-1){
                if(windowSum>maxSum){
                    maxSum = windowSum;
                }
                windowSum -= array[windowStart-k+1];
            }
        }
        return maxSum;
    }


    public static double findMaxSumSubarray2(int k, int[] array){
        double windowSum = 0;
        double maxSum = 0;
        for(int windowStart = 0; windowStart < array.length; windowStart++){
            windowSum += array[windowStart];
            if(windowStart >= k-1){
                maxSum = Math.max(windowSum,maxSum);
                windowSum -= array[windowStart-k+1];
            }
        }
        return maxSum;
    }
}
