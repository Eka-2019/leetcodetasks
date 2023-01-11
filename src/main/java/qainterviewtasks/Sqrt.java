package qainterviewtasks;

public class Sqrt {

    public int mySqrt(long x) {
        long result = 1;

        if (x != result * result) {
            for (int i = 0; i <= x; i++) {
                result = x / result;
            }
        }

        System.out.println(result);
        return (int) result;
    }

     public int sqrtExample(int num) {
        if (num <= 1) return num;
        double t;
        double result = num / 2;

        do {
            t = result;
            result = (t + (num / t)) / 2;
        } while ((t - result) != 0);

        return (int) result;
    }
}
