import java.net.Socket;
import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
  
        System.out.println("enter empID : ");
        int empID=in.nextInt();

        System.out.println("enter the department : ");
        String department=in.next();

        switch(empID){
            case 1:
                System.out.println("auchit op");
                break;

            case 2:
            System.out.println("no one op");
             break;
            
             case 3:
                System.out.println("employe no3");
                switch(department){
                    case "IT":
                        System.out.println("IT DEPARTMENT");
                        break;
                    
                    case "Management":
                        System.out.println("management department");
                        break;

                    default:
                        System.out.println("no department added");
                }
                break;
                
                default :
                System.out.println("enter correct empID");
        }


    }
    
}
