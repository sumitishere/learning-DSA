public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {23,43,56,67,8,9,11};
        int target = 56;
        int ans = linearSearch(nums,target);
        System.out.println(ans);


    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }

        return -1;
    }
}