public class EquilibriumIndex {
    public static void main(String[] args) {
        int a[] =new int[]{1,2,3,4,7,10};
        System.out.println(eqbIndex(a));

    }
    public static boolean eqbIndex(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        b[0] = a[0];
        for (int k = 1; k < n; k++) {
            b[k] = b[k - 1] + a[k];
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (b[n - 1] - b[0] == 0) {
                    return true;
                }
            } else {
                if (b[i - 1] == b[n - 1] - b[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    }
