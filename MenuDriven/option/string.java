package option;
import java.util.*;

public class string {
    String s = "";
    String ch = "";
    decoration d=new decoration();
    
    Scanner scan = new Scanner(System.in);

    public void get() {
        System.out.println("Enter String--");
        s = scan.nextLine();
    }
    public void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    public void option() {
        clearScreen();
        
        System.out.println("1.Reverse String");
        System.out.println("2.Get Length");
        System.out.println("3.Capitalize String");
        System.out.println("4.Lower Case");
        System.out.println("5.Capitalize First Letter");
        System.out.println("6.LowerCase First Letter");
        System.out.println("7.World Hello (original->Hello World)");
        System.out.println("8.olleH dlroW (original->Hello World)");
        System.out.println("9.Pattern Matching");
        System.out.println("10.Show String");
        ch = scan.nextLine();

        switch (ch) {
            case "1":
                clearScreen();
                d.animate();
                reverse(s);
                break;
                case "2":
                clearScreen();
                d.animate();
                getLength(s);
                break;
                case "3":
                clearScreen();
                d.animate();
                capital(s);
                break;
                case "4":
                clearScreen();
                d.animate();
                lower(s);
                break;
                case "5":
                clearScreen();
                d.animate();
                firstCapital(s);
                break;
                case "6":
                clearScreen();
                d.animate();
                firstLower(s);
                break;
                case "7":
                clearScreen();
                d.animate();
                zumble1(s);
                break;
                case "8":
                clearScreen();
                d.animate();
                zumble2(s);
                break;
                case "9":
                clearScreen();
                d.animate();
                patternMatch(s);
                break;
                case "10":
                clearScreen();
                d.animate();
                show(s);
                break;
                default:
                clearScreen();
                System.out.println("Enter Correct Input");
                break;
        }
    }

    public void reverse(String s) {
        StringBuffer temp = new StringBuffer(s);
        temp.reverse();
        System.out.println("After Reverse = " + temp);
    }

    public void getLength(String s) {
        System.out.println("String Length = " + s.length());
    }

    public void capital(String s) {
        String cap="";
        for(int i=0;i<s.length();i++){
            cap+=Character.toUpperCase(s.charAt(i));
        }

        System.out.println("Capitalized Successfully: " + cap);
    }

    public void lower(String s) {
        String low = s.toLowerCase();
        System.out.println("Lowered Case Successfully: " + low);
    }

    public void firstCapital(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        System.out.println("First Letter Capitalized: " + result.toString().trim());
    }

    public void firstLower(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toLowerCase(word.charAt(0)))
                      .append(word.substring(1)).append(" ");
            }
        }
        System.out.println("First Letter Lowercased: " + result.toString().trim());
    }

    public void show(String s) {
        System.out.println(s);
    }

    public void zumble1(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        System.out.println("After Zumbled: " + result.toString().trim());
    }

    public void zumble2(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" ");
        }
        System.out.println("After Zumbled: " + result.toString().trim());
    }

    public void patternMatch(String s) {
        System.out.println("Enter Pattern:");
        String ptr = scan.nextLine();
        if (s.contains(ptr)) {
            System.out.println("Pattern Exists in String");
        } else {
            System.out.println("Pattern Doesn't Exist in String");
        }
    }
}
