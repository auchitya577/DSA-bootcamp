
import java.util.Scanner;


public class main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int ans =sum2();
       System.out.println(ans);
    }
    static int sum2(){


    Scanner in=new Scanner(System.in);

    System.out.println("enter the first no. : ");
    int a=in.nextInt();
    System.out.println("enter the second no. :  ");
    int b=in.nextInt();

    int sum=a+b;
    return sum;

  
    }
}













    /*
           a  return_type()name (){
           /body
           return statement;
           }  
    
    */

