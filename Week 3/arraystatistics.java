public class ArrayStatistics {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }

    public static int minimum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int Min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        return Min;
    }

    public static int maximum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int countEven(int[] arr) {
        int Even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Even++;
            }
        }
        return Even;
    }

    public static void printSignCounts(int[] arr) {
        int P = 0;
        int N = 0;
        int Z = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                P++;
            } else if (arr[i] < 0) {
                N++;
            } else {
                Z++;
            }
        }
        System.out.println("Positive: " + P);
        System.out.println("Negative: " + N);
        System.out.println("Zero: " + Z);
    }
}