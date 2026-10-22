import java.util.Arrays;
import java.util.Scanner;

public class leetcode2 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    
        int[]nums={1,2,1};
      

        int n=nums.length;
        int[] arr=new int[n*2];

        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int j=0;
        for(int i=n;i<arr.length;i++){
          arr[i]=nums[j];
          j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}