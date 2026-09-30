import java.util.Scanner;

public class input0 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        int input=12313;

        while(input !=0){
            System.out.println("enter the number: ");
            input=in.nextInt();

            sum+=input;
        }
        System.out.println(sum);
    }
    
}
