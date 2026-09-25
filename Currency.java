import java.util.Scanner;

public class Currency {
public static void main(String[] args) {
    Scanner in= new Scanner(System.in);

    System.out.println("Enter amount in rupees: ");
    double rupees=in.nextDouble();

    double exchangerate=90;

    double usd = (rupees/90);

    System.out.println("USD = "+ usd);
}    
}
