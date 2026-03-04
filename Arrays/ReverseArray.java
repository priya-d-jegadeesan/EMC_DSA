class Solution {

    public static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {   
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        reverseArray(arr);

        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}