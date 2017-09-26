
public class Main {
    public static void main(String args[]) {
        int a[] = {9, 16,-1000, -23, 18, 20, 7, 23};
        int b[] = {17,20,48, 16,10, -23, -30, 20, 7, 23};

      Sorted d = new Sorted(a);
      System.out.println(d.prn(a));
        Sorted e = new Sorted(b);
        System.out.println(e.prn(b));

    }
}