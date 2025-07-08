package NeetCode.Sliding_Window;
import java.util.Arrays;
// Given an array, find the maximum sum of a subarray of size k.
// This is a common problem that can be solved using the sliding window technique.

public class Q1 {
    //A brute-force algorithm
    public static double[] maximumAvg1(int[] arr, int k){
        double[] arr1 = new double[arr.length - k +1];
        for(int i=0; i<arr.length - k +1;i++){
            double sum = 0;
            for(int j=i; j<i+k; j++){
                sum += arr[j];
            }
            arr1[i]=sum/k;
        }
        return arr1;
    }
    //Sliding Window approach
    public static double[] findAverages2(int k, int[] arr){
        double[] result = new double[arr.length-k+1];
        double windowSum = 0;
        int windowStart = 0;
        //int windowEnd = 0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum +=arr[windowEnd];

            if(windowEnd >= k-1){
                result[windowStart]= windowSum/k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,11,-7,15,14,21,-5,10};
        int k = 3;
        double[] result = findAverages2(k,arr);
        for (double d : result) {
            System.out.printf("%.3f ", d);
        }
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
}
