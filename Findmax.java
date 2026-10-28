import java.util.Arrays;

public class Findmax{
    public static void main(String[] args) {
        int[][]arr={
            {2,5,6},
            {3,8,7,4},
            {25,50,75,100,11}
        
        };
      
        int target =5;
        int ans=max(arr);
        System.out.println(max(arr));


    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row=0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                   max= arr[row][col]; 

                }
            }
        }
        return max;
    }

    
}
