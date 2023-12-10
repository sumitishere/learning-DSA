public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 25, 7,899};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];
        int max = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];
        int max = arr[arr.length - 1];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
