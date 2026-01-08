package two_pointers;
import java.util.Arrays;


public class Segregate_geeksforgeeks {

    // Question link => https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,0,1,1};
        int[] ans = segregate0and1(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] segregate0and1(int[] arr) {
        // code here
        int start = 0; 
        int end = arr.length - 1;
        int temp;
        
       while(start < end){
           if(arr[start] == 0){
               start++;
           }else if(arr[end] == 1){
               end--;
           }else{
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
           }
       }
       return arr;
    }
}
