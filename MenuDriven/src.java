import option.*;


import java.util.*;
class src{
    public static void main(String[] args) {
    boolean choice=true;
    String ch="";
    string str=new string();
    pattern p=new pattern();
    array arr=new array();
    decoration d=new decoration();
        Scanner scan=new Scanner(System.in);
    do {
        
        clearScreen();
        d.home();
        d.array();
        d.string();
        d.pattern();
        ch=scan.nextLine();
        switch (ch) {
            case "1":
                clearScreen();
                d.array();
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
                d.string();
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
                d.pattern();
                
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
        System.out.println("Do you want to continue to Main Menu(yes/no)");
        ch=scan.nextLine();
        if(!ch.equalsIgnoreCase("yes"))
          {  choice=false;
            d.end();;}
    }while(choice==true);     
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

}