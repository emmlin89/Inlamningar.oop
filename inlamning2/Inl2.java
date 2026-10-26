public class Inlamning2 {
    public static long evenSum(int from, int to) {

        long sum = 0;

        if (from > to) {

            return -1;

        } else

            for (long i = from; i <= to; i++) {
                if (i % 2 == 0) {

                    sum = sum + i;
                }
            }

        return sum;
    }
}
