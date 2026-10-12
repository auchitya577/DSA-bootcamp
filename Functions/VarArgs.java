import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      fun(2,644654,54,5,64,6);
      multiple(1, 3, "auchitya rajput");

    }
    static void multiple(int a,int b,String...v){
          System.out.println(a);
          System.out.println(b);
          System.out.println(Arrays.toString(v));
    }                 


    static void fun(int...v){
        System.out.println(Arrays.toString(v));

    }

    
}
