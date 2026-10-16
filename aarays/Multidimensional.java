import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    /*
        1 2 3
        4 5 6
        7 8 9    
    
    */

   
       int[][] arr=new int[3][3];
       System.out.print(arr.length);

       for(int row=0;row<arr.length; row++){
        // for each column
        for(int col=0;col<arr[row].length ;col++){
            arr[row][col]=in.nextInt();
        }
     }
     for(int row=0;row<arr.length; row++){
        // for each column
        for(int col=0;col<arr[row].length ;col++){
        System.out.print(arr[row][col]+ " ");
}
    System.out.println();

}}}

     // int[][] arr=new int[3][];
        // int[][] arr={
        //     {1,2,3},
        //     {3,2},
        //     {3,7,8}
        // };
 
