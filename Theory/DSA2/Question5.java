import java.util.ArrayList;
import java.util.Arrays;

public class Question5 {
    public static void printLIS(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        int[] prev = new int[n];
        Arrays.fill(lis, 1);
        Arrays.fill(prev, -1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    prev[i] = j;
                }
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (lis[i] > lis[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Length of LIS: " + lis[maxIndex]);
        System.out.print("LIS: ");
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = maxIndex; i != -1; i = prev[i]) {
            result.add(arr[i]);
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }
}
