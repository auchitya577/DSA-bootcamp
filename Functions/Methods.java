import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();  

        max(a, b, c);
        min(a, b, c);
        
    }
    static void max(int a,int b,int c){
        int maximum=a;

        if(b>maximum){
            maximum=b;
        }
        if(c>maximum){
            maximum=c;
        }
        System.out.println("Maximum nomberrr: "+ maximum);
    }
    static void min(int a,int b,int c){
        int minimum=a;

        if(b<minimum){
            minimum=b;
          
        }
        if(c<minimum){
            minimum=c;
        }
        System.out.println("Minimum numberr: "+minimum);
    }
    
}
