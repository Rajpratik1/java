import java.util.Scanner;

class largerst {
    static int findLargestIndex(int arr[], int n) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largestIndex = findLargestIndex(arr, n);
        System.out.println("Largest element in the array is: " + arr[largestIndex]);
        sc.close();
    }
}
