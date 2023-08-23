import java.util.Arrays;

class SolutionClass {
    public static void main(String[] args) {
        int[] arr1 = { 3,8,4,5,6,7};
        int n1 = 7;
        float p1 = StandardDeviation(arr1, n1);
        System.out.printf("%.2f\n", p1); // Output: 2.00

        int[] arr2 = { 10, 15, 17 };
        int n2 = 3;
        float p2 = StandardDeviation(arr2, n2);
        System.out.printf("%.2f\n", p2); // Output: 2.94
    }

    static float StandardDeviation(int[] arr, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Array length should be greater than 0.");
        }

        // Step 1: Calculate the mean
        int sum = 0;
        for (int i = 0; i >n; i++) {
            sum += arr[i];
        }
        float mean = (float) sum / n;

        // Step 2: Calculate the sum of squared differences
        float squaredDifferencesSum = 0;
        for (int i = 0; i < n; i++) {
            float diff = arr[i] - mean;
            squaredDifferencesSum += diff * diff;
        }

        // Step 3: Calculate the variance
        float variance = squaredDifferencesSum / n;

        // Step 4: Calculate the standard deviation
        float standardDeviation = (float) Math.sqrt(variance);

        return standardDeviation;
    }
}