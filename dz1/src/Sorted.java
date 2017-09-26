import java.util.Arrays;

public class Sorted {
    int first;
    int last;
    int sum;

    static Sorted Max = new Sorted (0,0,0);
    static Sorted Max2 = new Sorted (0,0,0);
    static Sorted Max3 = new Sorted (0,0,0);

    public Sorted(int first, int last, int sum) {
        this.first = first;
        this.last = last;
        this.sum = sum;
    }

    public Sorted(int a[]) {
        this.first = 0;
        this.last = a.length - 1;
        this.sum = arraysum(a);
    }

    private static int arraysum(int a[]) {
        int s = 0;
        for (int elem : a) {
            s += elem;
        }
        return s;
    }

    public static Sorted Sorted(int[] a) {

        int size = a.length -1;

            for (int i = 0; i < size/ 2; i++) {
                int s = size + i;
                int left[] = Arrays.copyOfRange(a, i, s / 2 + 1);
                int right[] = Arrays.copyOfRange(a, s / 2+1 , size + 1);
                Sorted l = new Sorted(i, s / 2, arraysum(left));
                Sorted r = new Sorted(s / 2+1, size, arraysum(right));
                if(l.sum > r.sum && l.sum >Max.sum ){
                    Max.first = l.first;
                    Max.last = l.last;
                    Max.sum = l.sum;
                }
                 if (r.sum > l.sum && r.sum > Max.sum) {
                    Max.first = r.first;
                    Max.last = r.last;
                    Max.sum = r.sum;
                }
            }
        if(Max.sum>=Max2.sum){
            Max3.first = Max.first;
            Max3.last=Max.last;
        }else{
            Max3.first = Max2.first;
            Max3.last=Max2.last;}
        return Max3;
    }

    public static String prn(int[] h){
        Sorted(h);
        return ("Начальный индекс макс.подмассива "+Max3.first+", Конечный индекс макс. подмассива "+Max3.last);

    }
}
