public class main {
    int binarySearch(int arr[], int l, int r, int x) {
        if (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                return binarySearch(arr, m + 1, r, x);
            } else {
                return binarySearch(arr, l, m - 1, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 32, 8, 3};

    }
}
