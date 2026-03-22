public class SubArraySumEquals {

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1 };
        int k = 2;

        System.out.println(SubArraySumEquals.subArraySum(nums, k));
    }

    public static int subArraySum(int a[], int k) {

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            int sum = a[i];

            if (sum == k) {
                count++;
            }

            for (int j = i + 1; j < a.length; j++) {
                sum = sum + a[j];

                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

}
