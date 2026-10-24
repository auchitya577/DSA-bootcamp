import java.util.Scanner;

public class AOS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the side");
        double side=in.nextDouble();

     

        double area=side*side;

        System.out.println(area);
    }
}
