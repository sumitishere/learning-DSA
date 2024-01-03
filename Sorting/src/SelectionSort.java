import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){

        for (int i=0;i<arr.length;i++){
            //find the mex item in remaing array and swap wiht correct
            int last = arr.length-i-1;
            int maxIdx = getMaxIndex(arr,0,last);
            swap(arr, maxIdx,last);
        }
    }

    static void swap(int[] arr, int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){

        int max = start;
        for(int i=start;i<end;i++){
            if(arr[max]<arr[i]){
                max = arr[i];
            }
        }

        return max;
    }


}
