public class Problem24 {

    private int[] number;

    public Problem24(int size) {
        number = new int[size];
        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }
    }

    public int[] permutate(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                //if case: c < b < a
                //c < a > b
                //b > c < a
                //b < a > c etc.
                if (n[i] < n[j]) {
                    int[] arr1 = new int[i];
                    int[] arr2 = new int[n.length - i];
                    System.arraycopy(n, 0, arr1, 0, arr1.length);
                    System.arraycopy(n, i, arr2, 0, arr2.length);
                    n = new int[n.length];
                    System.arraycopy(arr1, 0, n, )
                }
                return n;
                //Base case: a > b > c
            }
        }
    }
    
}