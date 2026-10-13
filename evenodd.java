import java.util.Scanner;


public class evenodd {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the nu,mber");
    int n=in.nextInt();

    if(n%2==0){
        System.out.println("number is even");
    }
    else {
        System.out.println("no. is odd");
    }
    
}    
}
