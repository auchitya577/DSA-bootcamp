import java.util.Scanner;

public class AOR {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the first diagonal");
        double dig1=in.nextDouble();

        System.out.println("enter the second diagonal");
        double dig2=in.nextDouble();

        double area=0.5*dig1 * dig2;

        System.out.println(area);
    }
}
