public class binary {
    public static void main(String[] args) {
        int [] arr={-1,0,3,5,9,12};
        int target=4;
      int ans= search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
