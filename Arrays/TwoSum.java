
public class TwoSum {

    public static void main(String[] args) {
        int a[] = { 2, 7, 11, 15 };
        int t = 9;

        int[] result = twoSum(a, t);

        System.out.println(result[0] + " " + result[1]);

    }

    public static int[] twoSum(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            int first = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];

                int sum = first + second;

                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};

    }

}
