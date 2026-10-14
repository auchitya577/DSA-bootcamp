 import java.util.Arrays;
import java.util.Scanner;



public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        // ARRAY OF PRIMITIVES
        // int[] arr=new int[5];
        // arr[0]=21;
        // arr[1]=222;
        // arr[2]=3232;
        // arr[3]=44;
        // arr[4]=11;
        

        // System.out.println(arr[1]);

        //INPUT USING FOR LOOPS

        // for(int i=0; i<arr.length; i++){
        //     arr[i]=in.nextInt();
        // }
        //    for(int i=0; i<arr.length; i++){
        //     System.out.println(Arrays.toString(arr));
        // }

        // ARRAYS OF OBJECTS
        String[] str=new String[4];
        for(int i=0; i<str.length; i++){
            str[i]=in.next();
         
        }
        System.out.print(Arrays.toString(str));



    }
    
}
