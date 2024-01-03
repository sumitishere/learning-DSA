import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {10,30,40,50,20};
        int[] arr2 = {1,2,3,4,5};
        bubble(arr2);
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}