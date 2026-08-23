public class BitFundamentals {

    public static boolean isOdd(int number) {

        return (number & 1) != 0;
    }

    public static int countSetBitsShift(int number) {

        int count = 0;

        for (int i = 0; i < 32; i++) {

            if ((number & 1) != 0) {
                count++;
            }

            number = number >>> 1;
        }

        return count;
    }

    public static int countSetBitsFast(int number) {

        int count = 0;

        while (number != 0) {

            number = number & (number - 1);
            count++;
        }

        return count;
    }

    public static boolean isPowerOfTwo(int number) {

        if (number <= 0) {
            return false;
        }

        return (number & (number - 1)) == 0;
    }
}