public class Overloading {
    public static void main(String[] args) {
        // fun(8);
        // fun("Auchitya rajputt");
        int ans=sum(454,5);
        System.out.println(ans);
    }
       static int sum(int a,int b){
        return a+b;
       }

        static int sum(int a,int b,int c){
        return a+b+c;
       }}
          
    // // THE ABILITY OF THE PROGRAM TO KNOW WHICH FUNC SHOULD RUN IS KNOWN AS OVERLOADING
    // static void fun(int a){
    //  System.out.println(a);
    // }
    

    //  static void fun(String name){
    //     System.out.println(name);
    //  }
    // }
    
