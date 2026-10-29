import java.util.Arrays;

public class Searchin2darray {
    public static void main(String[] args) {
        int[][]arr={
            {2,5,6},
            {3,8,7,4},
            {25,50,75,100,11}
        
        };
      
        int target =5;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));


    }
    static int[] search(int[][] arr,int target){
        for (int row=0; row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col}; 

                }
            }
        }
         return new int[]{-1,-1};
    }

    
}
