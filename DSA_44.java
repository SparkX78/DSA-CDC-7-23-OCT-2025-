import java.util.*;
public class DSA_44 {
    public static int[] smallestElement(int[] arr, int n){
        int[] result = new int[n];
        for(int i = 0; i < arr.length; i++){
            int min = -1;
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i]){
                    if(min == -1 || arr[j] > min){
                        min = arr[j];
                    }
                }
            }
            result[i] = min;
        }
        return result;
    }
    public static void main(String args[]){
        int[] arr = {2, 5, 3, 7, 8, 6};
        int[] result = smallestElement(arr, arr.length);
        System.out.println(Arrays.toString(result));
    }
}
