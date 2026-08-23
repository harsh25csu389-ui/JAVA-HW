public class BitMaskUtility {

    public static boolean isBitSet(int number, int position) {

        if (position < 0 || position > 31) {
            return false;
        }

        int mask = 1 << position;

        return (number & mask) != 0;
    }

    public static int setBit(int number, int position) {

        if (position < 0 || position > 31) {
            return number;
        }

        int mask = 1 << position;

        return number | mask;
    }

    public static int clearBit(int number, int position) {

        if (position < 0 || position > 31) {
            return number;
        }

        int mask = 1 << position;

        return number & ~mask;
    }

    public static int toggleBit(int number, int position) {

        if (position < 0 || position > 31) {
            return number;
        }

        int mask = 1 << position;

        return number ^ mask;
    }

    public static String toBinary32(int number) {

        return String.format("%32s", Integer.toBinaryString(number))
                .replace(' ', '0');
    }
}