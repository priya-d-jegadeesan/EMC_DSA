public class MaximumSubArray {

    public static void main(String[] args) {

        int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(a));

    }

    public static int maxSubArray(int a[]) {

        int sum = 0;
        int max = a[0];

        for (int i = 0; i < a.length; i++) {

            sum = sum + a[i];

            if (max < sum) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

}
