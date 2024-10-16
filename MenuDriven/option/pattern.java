package option;
import java.util.*;
public class pattern {
    int n;
    String s;
    decoration d=new decoration();
    Scanner scan=new Scanner(System.in);
    
    
    public void get()
    {
        System.out.println("Enter Number of Rows--");
        int num=scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter Content of Columns--");
        String st=scan.nextLine();

        n=num;

        s=st;
    }
    public void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    public void option()
    {   
        clearScreen();
        d.pattern();
        System.out.println("1.Wall Pattern");
        System.out.println("2.Left Side Triangle");
        System.out.println("3.Right Side Triangle");
        System.out.println("4.Change Rows and String");
        System.out.println("5.Filled X Pattern");
        System.out.println("6.Hollow X Pattern");
        System.out.println("7.Pyramid");
        System.out.println("8.Falling Star");
        System.out.println("9.Diamond");
        // System.out.println("10.ButterFly");
        String ch;
        ch=scan.nextLine();
        switch (ch) {
            case "2":
            clearScreen();
            d.animate();
            d.circle();
            
            leftTriangle();            
            break;
            
            case "1":
            clearScreen();
            d.circle();
            d.animate();
            wall();
            break;
            case "3":
            clearScreen();
            d.circle();
            d.animate();
            rightTriangle();            
            break;
            case "4":
            clearScreen();
            d.circle();
            d.animate();
            get();            
            break;
            case "5":
            d.circle();
            clearScreen();
            d.animate();
            filledX();            
            break;
            case "6":
            clearScreen();
            d.circle();
            d.animate();
            hollowX();            
            break;
            case "7":
            clearScreen();
            d.circle();
            d.animate();
            pyramid();            
            break;
            case "8":
            clearScreen();
            d.circle();
            fallingStar();            
            break;
            case "9":
            clearScreen();
            d.circle();
            d.animate();
            diamond();           
            break;
            // case "10":
            // ;           
            // break;
            
            default:
            System.out.println("Enter Correct Input");
            break;
        }
        
        
        
    }
    
    public void wall(){
        for(int i=1;i<=n;i++)
        {
            System.out.println(s.repeat(n));
        }
    }
    public void leftTriangle(){
        for(int i=1;i<=n;i++)
        System.out.println(s.repeat(i));
    }
    public void rightTriangle(){
        for(int i=1;i<=n;i++){
            System.out.println(" ".repeat(n-i)+s.repeat(i));
            
        }
        }
    public void filledX(){
        for(int i=1;i<=n+n-1;i++){
            if(i<=n)
            System.out.println(" ".repeat(i-1)+(s+s).repeat(n-i+1));
            else
            System.out.println(" ".repeat(n+n-i-1)+(s+s).repeat(i-n+1));
        }
    }
    public void hollowX(){
        
        for(int i=1;i<=n+n-1;i++){
            if(i==1||i==n+n-1)
            System.out.println((s+s).repeat(n));
            else if(i<=n)
            System.out.println(" ".repeat(i-1)+s+(" "+" ").repeat(n-i)+s);
            
            else
            System.out.println(" ".repeat(n+n-i-1)+s+(" "+" ").repeat(i-n)+s);
        }
    }
    public void pyramid(){
        for(int i=1,j=0;i<=n;i++){
            System.out.println(" ".repeat(n-i)+(s).repeat(i+j++));
        }
    }
    public void fallingStar(){
        System.out.println("Enter Column Size--");
        int c=scan.nextInt();
        int arr[]=new int[c];
        scan.nextLine();
        System.out.println("Enter Column Value--");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        d.animate();
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            
        }
        System.out.println();
        int m=Arrays.stream(arr).max().getAsInt();
        for(int i=1;i<=m;i++)
        {
            for(int j=0;j<arr.length;j++){
                if(arr[j]>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
                System.out.println();
        }

        
    }
    public void diamond(){
        for(int i=1;i<=n+n-1;i++){
            if(i<=n)
            System.out.println(" ".repeat(n-i)+(s+" ").repeat(i));
            else 
            System.out.println(" ".repeat(i-n)+(s+" ").repeat(n+n-i));
        }
    }
    // public void ButterFly(){
    //     for(int i=1;i<=n;i++){
    //         if(i<=Math.ceil(n/2))
    //         {
    //             System.out.println(s.repeat(i)+" ".repeat(n-i-2)+s.repeat(i));
    //         }
    //     }
    // }


}
