import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
      int[] nums1={4,9,5,6};
      int[] nums2={9,4,9,8,4};
        System.out.println(intersection(nums1,nums2));
    }
        static ArrayList<Integer> intersection(int[] nums1, int[] nums2) {
            ArrayList <Integer> arr=new ArrayList<Integer> ();
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i] == nums2[j]){
                        arr.add(nums2[j]);
                        break;
                    }
                }
            }
            return (arr);
        }
    }