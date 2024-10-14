import option.*;


import java.util.*;
class src{
    public static void main(String[] args) {
    boolean choice=true;
    String ch="";
    string str=new string();
    pattern p=new pattern();
    array arr=new array();
        Scanner scan=new Scanner(System.in);
    do {
        
        clearScreen();
        System.out.println("\t\t----Home Page----");
        System.out.println("1.Array");
        System.out.println("2.String");
        System.out.println("3.Pattern");
        ch=scan.nextLine();
        switch (ch) {
            case "1":
                clearScreen();
                System.out.println("\t----Array------");
                arr.get();
                
                while(true){

                    arr.option();
                    System.out.println("Do you want Array Block to be repeat(yes/no)");
                    ch=scan.nextLine();
                    if(!ch.equalsIgnoreCase("yes"))break;
                }
                break;
                case "2":
                clearScreen();
                System.out.println("\t----String------");
                str.get();
                
                while(true){

                    str.option();
                    System.out.println("Do you want String Block to be repeat(yes/no)");
                    ch=scan.nextLine();
                    if(!ch.equalsIgnoreCase("yes"))break;
                }
                break;
                case "3":
                p.get();
                clearScreen();
                System.out.println("\t----Pattern------");
                
                while(true){
                    
                    p.option();
                    System.out.println("Do you want Pattern Block to be repeat(yes/no)");
                    ch=scan.nextLine();
                    if(!ch.equalsIgnoreCase("yes"))break;
                }
                
                break;
                
                default:
                clearScreen();
                System.out.println("Please input valid options");
                break;
        }
        System.out.println("Do you want to continue(yes/no)");
        ch=scan.nextLine();
        if(!ch.equalsIgnoreCase("yes"))
            choice=false;
    }while(choice==true);     
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

}