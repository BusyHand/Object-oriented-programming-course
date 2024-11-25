package lab_4.overload;

public class MinMax {

    public int max(int a, int b) {
        return (int) max((double) a, (double) b);
    }

    public long max(long a, long b) {
        return (long) max((double) a, (double) b);
    }

    public double max(double a, double b) {
        return a > b ? a : b;
    }

    public int min(int a, int b) {
        return (int) min((double) a, (double) b);
    }

    public long min(long a, long b) {
        return (long) min((double) a, (double) b);
    }

    public double min(double a, double b) {
        return a < b ? a : b;
    }
}
