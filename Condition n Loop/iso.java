import java.util.Scanner;

public class iso {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the breadth");
        double breadth=in.nextDouble();

        System.out.println("enter the second diagonal");
        double height=in.nextDouble();

        double area=0.5*breadth * height;

        System.out.println(area);
    }
}
