public class Question1 {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findLargestEven(int[] arr) {
        int largestEven = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num % 2 == 0 && num > largestEven) {
                largestEven = num;
            }
        }
        return (largestEven == Integer.MIN_VALUE) ? -1 : largestEven;
    }

    public static int findSmallestOdd(int[] arr) {
        int smallestOdd = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num % 2 != 0 && num < smallestOdd) {
                smallestOdd = num;
            }
        }
        return (smallestOdd == Integer.MAX_VALUE) ? -1 : smallestOdd;
    }
}