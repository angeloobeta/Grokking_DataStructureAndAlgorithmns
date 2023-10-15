package sliding_window_problem;

import java.util.Arrays;

// Problem: Given an array, find the average of all contiguous sub-arrays of size ‘K’ in it.
public class AverageSumOfArray_1 {
    public static double[] findAverage1(int K, int [] array){
        double[] result = new double[array.length-K+1];
        for(int i = 0; i < result.length; i++){
           double sum = 0;
            for(int j = i; j < K+i; j++){
                sum += array[j];
            }
            result[i] = sum/K;
        }
        return result;
    }

    public static double[] findAverage2(int k, int[] array){
        double[] result = new double[array.length-k+1];
        double firstKSum = Arrays.stream(array,0,k).sum();
        result[0] = firstKSum/k;
        double sum = firstKSum;
        for(int i = k; i < array.length; i++)
        {
            sum += array[i];
            sum-= array[i-k];
            result[i-k+1] = sum/k;
        }
        return result;
    }

    public static double[] findAverage3(int k, int[] array){
        double [] result = new double[array.length-k+1];
        double windowSum = 0;
        for(int windowStart = 0; windowStart < array.length; windowStart++){
            windowSum += array[windowStart];
            if(windowStart >= k-1){
                result[windowStart-k+1] = windowSum/k;
                windowSum -= array[windowStart-k+1];
            }
        }
        return result;
    }
}
