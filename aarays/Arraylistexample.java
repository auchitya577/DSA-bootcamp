import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Syntax

        ArrayList<Integer> list=new ArrayList<>(10);

        // list.add(7822);
        // list.add(768);
        // list.add(978);
        // list.add(8);
        // list.add(78);

        // // System.out.print(list);
        // System.out.println(list);
        // // list.set(1,99);

        // list.remove(2);
        // System.out.println(list);

        //input
        for(int i=0;i<5;i++ ){
            list.add(in.nextInt());
        }
        System.out.println(list);

            
}
}
