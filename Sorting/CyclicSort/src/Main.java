import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1, 10, 56, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
//        int n = arr.length;
        while (i < arr.length) {
            int checkCorrectIndex = arr[i] - 1;
            if (arr[i] != arr[checkCorrectIndex]) {
                swap(arr, i, checkCorrectIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}