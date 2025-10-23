import java.util.*;
public class DSA_43 {
    public static int[] nextGreater(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int nextIndex = -1;
            int num1 = nums1[i];

            for(int j = 0; j < nums2.length; j++){
                if(num1 == nums2[j]){
                    nextIndex = j;
                    break;
                }
            }
            int nextGreater1 = -1;
            for(int k = nextIndex+1; k < nums2.length; k++){
                if(nums2[k] > num1){
                    nextGreater1 = nums2[k];
                    break;
                    
                }
            }
            result[i] = nextGreater1;
        }
        return result;
    }
    public static void main(String args[]){
        int[] nums1 = {2, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 5};
        int[] result = nextGreater(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
