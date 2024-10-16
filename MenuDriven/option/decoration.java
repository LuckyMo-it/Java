package option;

import java.io.PrintStream;

public class decoration {
    public void animate(){
        System.out.println("Making Content For you::");
        int i=0;
        try{
            for(;i<=30;i++){
                if(i%4==0)Thread.sleep(150);
                System.out.print("#");

            }
        }
        catch(Exception e){
            
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }  
    public void circle(){
        int i=0;
        System.out.print("\\");
        try {
            for(;i<=100;i++)
            {
                if(i%2==0)
                {
                    System.out.print("\b\\");
                    Thread.sleep(50);
                }
                else if(i%3==0)
                {
                    System.out.print("\b|");
                    Thread.sleep(50);
                }
                else if(i%5==0)
                {
                    System.out.print("\b-");
                    Thread.sleep(100);
                }
                else if(i%7==0)
                {
                    System.out.print("\b/");
                    Thread.sleep(100);
                }
            }
            System.out.println("\b\b  ");
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("   ");
    }
    public void array(){
        System.out.println(" ____        _____                             ");
        System.out.println("/_   |      /  _  \\___________________  ___.__.");
        System.out.println(" |   |     /  /_\\  \\_  __ \\_  __ \\__  \\<   |  |");
        System.out.println(" |   |    /    |    \\  | \\/|  | \\/ __ \\\\___  |");
        System.out.println(" |___| /\\ \\____|__  /__|   |__|  (____  / ____|");
        System.out.println("       \\/         \\/                  \\/\\/     ");
    }
    public void string()
    {
        System.out.println("________        _________ __         .__                ");
        System.out.println("\\_____  \\      /   _____//  |________|__| ____    ____  ");
        System.out.println(" /  ____/      \\_____  \\\\   __\\_  __ \\  |/    \\  / ___\\ ");
        System.out.println("/       \\      /        \\|  |  |  | \\/  |   |  \\/ /_/  >");
        System.out.println("\\_______ \\ /\\ /_______  /|__|  |__|  |__|___|  /\\___  / ");
        System.out.println("        \\/ \\/         \\/                     \\//_____/  ");
    }
    public void pattern(){
        System.out.println("________     __________         __    __                       ");
        System.out.println("\\_____  \\    \\______   \\_____ _/  |__/  |_  ___________  ____  ");
        System.out.println("  _(__  <     |     ___/\\__  \\\\   __\\   __\\/ __ \\_  __ \\/    \\ ");
        System.out.println(" /       \\    |    |     / __ \\|  |  |  | \\  ___/|  | \\/   |  \\");
        System.out.println("/______  / /\\ |____|    (____  /__|  |__|  \\___  >__|  |___|  /");
        System.out.println("       \\/  \\/                \\/                \\/           \\/ ");
    }
    public void home()
    {
        String[] art = {
            "\t\t\t\t░  ░░░░  ░░░      ░░░  ░░░░  ░░        ░░░░░░░░       ░░░░      ░░░░      ░░░        ░",
            "\t\t\t\t▒  ▒▒▒▒  ▒▒  ▒▒▒▒  ▒▒   ▒▒   ▒▒  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒  ▒▒  ▒▒▒▒  ▒▒  ▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒▒",
            "\t\t\t\t▓        ▓▓  ▓▓▓▓  ▓▓        ▓▓      ▓▓▓▓▓▓▓▓▓▓       ▓▓▓  ▓▓▓▓  ▓▓  ▓▓▓   ▓▓      ▓▓▓",
            "\t\t\t\t█  ████  ██  ████  ██  █  █  ██  ██████████████  ████████        ██  ████  ██  ███████",
            "\t\t\t\t█  ████  ███      ███  ████  ██        ████████  ████████  ████  ███      ███        █",
            "\t\t\t\t                                                                                       "
        };
       
        for (String line : art) {
            System.out.println(line);
            
        }
    }
    public void end(){
        String[] str= new String[6];
        str[0] = "                   ___________.__             ___________           .___                   ";
        str[1] = "                   \\__    ___/|  |__   ____   \\_   _____/ ____    __| _/                   ";
        str[2] = "  ______   ______    |    |   |  |  \\_/ __ \\   |    __)_ /    \\  / __ |    ______   ______ ";
        str[3] = " /_____/  /_____/    |    |   |   Y  \\  ___/   |        \\   |  \\/ /_/ |   /_____/  /_____/ ";
        str[4] = "                     |____|   |___|  /\\___  > /_______  /___|  /\\____ |                    ";
        str[5] = "                                   \\/     \\/          \\/     \\/      \\/                   ";
        try {
            
            
            for(int i=0;i<str.length;i++)
            {
                for(int j=0;j<str[i].length();j++){
                System.out.println(str[j]);
                Thread.sleep(175);
            }
                System.out.println();
            }

            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
