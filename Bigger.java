import java.util.Scanner;


public class Bigger {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

System.out.println("enter first no.: ");
        int a=in.nextInt();

        System.out.println("enter second no. :  ");
        int b=in.nextInt();

        System.out.println("enter third no.: ");
        int c=in.nextInt();

        if(a>b && a>c){
            System.out.println("a is greaterrr");

        }else if(b>a && b>c){
            System.out.println("b is greterrr");
           }
           else {
            System.out.println("c is greater");
        }
         
        
        
        
    }
    
}
