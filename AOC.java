import java.util.Scanner;

public class AOC {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the radius");
        double radius=in.nextDouble();

        double area = 3.14*radius*radius;

        System.out.println(area);
    }
    
}
