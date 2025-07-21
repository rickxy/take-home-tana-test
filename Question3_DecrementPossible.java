public class Question3_DecrementPossible {

    public static int canMakeZeros(int[] a) {
        int n = a.length;

        int[] arr = a.clone();

        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = n - 1; i >= 1; i--) {
                if (arr[i] == 0) continue;
                if (arr[i - 1] == 0) return 0; 
                if (arr[i] >= arr[i - 1]) {
                    arr[i] -= arr[i - 1];
                    changed = true;
                } else {
                    continue;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] != 0) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println("Can make zeros? " + canMakeZeros(arr1)); 

        int[] arr2 = {2, 3, 5};
        System.out.println("Can make zeros? " + canMakeZeros(arr2)); 
    }
}
