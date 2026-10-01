import java.util.Scanner;

public class input1 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);

    int n;
    int largest=0;

    while(true){

        System.out.println("enter the input:  ");
         n=in.nextInt();

         if(n==0){
            break;
         }

         if(n>largest){
                  
           largest=n;

         }
    }
    System.out.println(largest);
}    
}
