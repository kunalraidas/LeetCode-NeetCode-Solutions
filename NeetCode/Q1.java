// find missing number in given array of size n-1;
package NeetCode;

public class Q1 {

   public int findNum(int[] arr, int k){
    int sum = 0;
    int asum =0;
    for (int i : arr) {
        sum = sum + i;
    }
        asum = (k * (k + 1)) / 2;
         return asum - sum;
    }
    public static void main(String[] args) {
        Q1  q1 = new Q1();
        int[] arr = {6,4,3,2,1};
        System.out.println(q1.findNum(arr, 6));
    }
}