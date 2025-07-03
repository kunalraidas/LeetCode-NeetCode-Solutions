// Find the leader in an array
// A leader is an element that is greater than all the elements to its right.
package NeetCode;

public class Q2 {

    public static void findLeaders(int[] arr) {
        int maxFromRight = arr[arr.length - 1];
        System.out.print(maxFromRight + " ");

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }
}
