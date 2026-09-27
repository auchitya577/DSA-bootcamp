import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
    Scanner in=new Scanner(System.in);

    //TAKE INPUT FROM USER TILL USER DO NOT PRESS x or X

    int ans=0;
    System.out.println("enter the operator: ");

    while(true){
        //taking operator as input
        char op=in.next().trim().charAt(0);

        if(op=='+' || op=='-' || op=='*' || op=='%' || op=='/');
        //input two numbers
         
        System.out.println("enter the two numbers: ");

        int num1=in.nextInt();
        int num2=in.nextInt();

        if(op=='+'){
            ans=num1+num2;
        }
        
        if(op=='-'){
            ans=num1-num2;
        }

        if(op=='*'){
            ans=num1*num2;

        }

        if(op=='/'){
            if (num2!=0){
                ans=num1 /num2;
            }
        }
        System.out.println(ans);
    
    }
 }   
}
