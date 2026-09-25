import java.util.Scanner;

public class Simpleinterest{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter  principal: ");
        double principal=in.nextDouble();

        System.out.println("Enter rate: ");
        double rate=in.nextDouble();

        System.out.println("Enter time: ");
        double time=in.nextDouble();

        double SimpleInterest=(principal * rate * time)/100;

        System.out.println(SimpleInterest);


    }
}