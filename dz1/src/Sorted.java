import java.util.Arrays;

public class Sorted {
    public int[] Max(int[] a) {
        int sum = 0;
        int firstin = 0;
        int n = 0;
        int lastind = -1;
        int Maxsum = -1;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > Maxsum) {
                Maxsum = sum;
                lastind = i;
                firstin = n;
            } else if (sum < 0) {
                sum = 0;
                n = i + 1;
            }
        }
        return Arrays.copyOfRange(a, firstin, lastind + 1);
    }
}
