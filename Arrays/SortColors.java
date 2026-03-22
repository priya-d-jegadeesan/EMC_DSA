public class SortColors {

    public static void main(String[] args) {
        int nums[] = { 2, 0, 1 };
        sortColors(nums);

        for (int a : nums) {
            System.out.print(a + " ");
        }

    }

    public static void sortColors(int a[]) {
        int start = 0;
        int end = a.length - 1;
        int mid = 0;

        while (mid <= end) {

            if (a[mid] == 2) {
                int temp = a[mid];
                a[mid] = a[end];
                a[end] = temp;
                end--;

            } else if (a[mid] == 0) {
                int temp = a[mid];
                a[mid] = a[start];
                a[start] = temp;
                start++;
                mid++;
            }

            else {
                mid++;
            }
        }
    }

}

// LEETCODE SUBMITTED
// Dutch National Flag Algorithm
/*
 * class Solution {
 * public void sortColors(int[] a) {
 * 
 * int start = 0;
 * int end = a.length-1;
 * int mid = 0;
 * 
 * while(mid<=end){
 * 
 * if(a[mid]==2){
 * int temp = a[mid];
 * a[mid]=a[end];
 * a[end]=temp;
 * end--;
 * }
 * else if(a[mid]==0){
 * int temp = a[mid];
 * a[mid]=a[start];
 * a[start]=temp;
 * start++;
 * mid++;
 * }
 * else{
 * mid++;
 * }
 * 
 * 
 * }
 * }
 * }
 */
