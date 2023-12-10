public class searchInRange {
    public static void main(String[] args) {

      //Given an Array 18,12,-7,3,14,28
      //search for 12 in the range of index 1 till 4
      int[] num = {18,12,-7,3,14,28};
      int target = 3;

      int ans = searchInRange(num,target,1,4);
      System.out.println(ans);

    }

    static int searchInRange(int[] arr, int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start;i<=end;i++){

            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
