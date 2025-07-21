public class Question5_ClosestMinimumDistance {

    public static int closestMinDistance(int[] a) {
        int min = Integer.MAX_VALUE;

        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }

        int minDistance = Integer.MAX_VALUE;
        int lastMinIndex = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                if (lastMinIndex != -1) {
                    minDistance = Math.min(minDistance, i - lastMinIndex);
                }
                lastMinIndex = i;
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1, 4, 5, 2};
        System.out.println("Closest min distance: " + closestMinDistance(arr1)); 

        int[] arr2 = {5, 6, 1, 2, 1, 9, 1};
        System.out.println("Closest min distance: " + closestMinDistance(arr2)); 
    }
}
