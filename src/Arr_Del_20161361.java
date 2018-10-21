public class Arr_Del_20161361 {
    public static void main(String[] args) {
        int b[] = null;
        b = new int[16];
        int a[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        for(int i =0;i<a.length;i++) {
            if (a[i] != 0) {
                b[i] = a[i];
                System.out.print(b[i]);
            }
        }
    }
}
