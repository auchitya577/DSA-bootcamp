import java.util.Scanner;

public class Greeting{
    public static void main(String[] args) {
        // greeting();
          
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur name:  ");
        String name=sc.next();

        String personalised=myGreet("auchitya rajput");
        System.out.println(personalised);
    }

    static String myGreet(String name){
         String message="hello"+ name;
         return message;

    }

    static void greeting(){
        System.out.println("hello world");
    }
}
