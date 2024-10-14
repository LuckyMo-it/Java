package option;

public class decoration {
    public void animate(){
        System.out.println("Making Content For you::");
        int i=0;
        try{
            for(;i<=30;i++){
                if(i%4==0)Thread.sleep(350);
                System.out.print("#");

            }
        }
        catch(Exception e){
            
        }
        System.out.println();
    }  
    public void circle(){
        int i=0;
        System.out.print("\\");
        try {
            for(;i<=100;i++)
            {
                if(i%5==0)
                {
                    System.out.print("\b\\");
                    Thread.sleep(100);
                }
                else if(i%7==0)
                {
                    System.out.print("\b-");
                    Thread.sleep(100);
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("   ");
    }
}
