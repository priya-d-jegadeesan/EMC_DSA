public class FindPivotIndex {

   public static void main(String[] args) {
      int nums[] = { 1, 7, 3, 6, 5, 6 };
      System.out.println(pivotIndex(nums));
   }

   public static int pivotIndex(int a[]) {

      int prefixSum[] = new int[a.length];
      prefixSum[0] = a[0];

      for (int i = 1; i < a.length; i++) {
         prefixSum[i] = prefixSum[i - 1] + a[i];
      }
      for (int i = 0; i < a.length; i++) {
         int left;
         if (i == 0) {
            left = 0;
         } else {
            left = prefixSum[i - 1];
         }
         int right;
         if (i == a.length - 1) {
            right = 0;
         } else {
            right = prefixSum[a.length - 1] - prefixSum[i];
         }
         if (left == right) {
            return i;
         }
      }
      return -1;

   }

}

// LEETCODE SUBMITTED
/*
 * class Solution {
 * public int pivotIndex(int[] a) {
 * 
 * int preFixSum [] = new int[a.length];
 * 
 * preFixSum[0] = a[0];
 * 
 * for(int i=1; i<a.length; i++){
 * preFixSum[i] = preFixSum[i-1] + a[i];
 * }
 * 
 * for(int i=0; i<a.length; i++){
 * int left;
 * if(i==0){
 * left=0;
 * }
 * else{
 * left=preFixSum[i-1];
 * }
 * int right;
 * if(i==a.length-1){
 * right=0;
 * }
 * else{
 * right=preFixSum[a.length-1] - preFixSum[i];
 * }
 * 
 * if(left == right){
 * 
 * return i;
 * }
 * }
 * 
 * return -1;
 * }
 * }
 */
