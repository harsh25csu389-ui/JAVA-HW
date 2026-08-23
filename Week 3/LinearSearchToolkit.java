public class LinearSearchToolkit {

    public static boolean contains(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int firstIndexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(int[] values, int target) {
        int last = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                last = i;
            }
        }
        return last;
    }

    public static int countOccurrences(int[] values, int target) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                count++;
            }
        }
        return count;
    }
}