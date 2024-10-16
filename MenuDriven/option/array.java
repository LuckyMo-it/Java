package option;
import java.util.*;

public class array {
    int arr[];
    int temp;
    decoration d=new decoration();

    Scanner scan = new Scanner(System.in);

    // Option method to display the menu
    public void option() {
        clearScreen();
        d.array();
        System.out.println("1.Change Array Input");
        System.out.println("2.Traverse Array");
        System.out.println("3.Sort Array");
        System.out.println("4.Find Maximum");
        System.out.println("5.Deletion ");
        System.out.println("6.Find Minimum");
        System.out.println("7.Search Element");
        String ch = scan.nextLine();
        
        switch (ch) {
            case "1":
                clearScreen();
                d.animate();
                get();
                break;
                case "2":
                clearScreen();
                d.animate();
                traverse();
                break;
                case "3":
                clearScreen();
                d.animate();
                sort();
                break;
                case "4":
                clearScreen();
                d.animate();
                max();
                break;
                case "5":
                clearScreen();
                d.animate();
                min();
                break;
                case "6":
                clearScreen();
                search();
                break;
                default:
                clearScreen();
                System.out.println("Enter Correct Input");
                break;
            }
        }
        
    // Method to get array input
    public void get() {
        System.out.println("Enter Size of Array:");
        int n = scan.nextInt();
        arr = new int[n]; // Allocate array dynamically
        
        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        scan.nextLine(); // Consume newline character to avoid issues with nextLine
    }
    
    // Method to traverse and print array elements
    public void traverse() {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Method to sort the array
    public void sort() {
        System.out.println("--------Sort Tab--------");
        System.out.println("1.Selection Sort\t2.Bubble Sort\t3.Insertion Sort");
        String c = scan.nextLine();
        
        switch (c) {
            case "1":
                System.out.println("----------Selection Sort-------");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] > arr[j]) {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                System.out.println("Selection Sort completed.");
                break;
                
                case "2":
                System.out.println("----------Bubble Sort-------");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Bubble Sort completed.");
                break;
                
                case "3":
                System.out.println("----------Insertion Sort-------");
                int n = arr.length;
                for (int i = 1; i < n; ++i) {
                    int key = arr[i];
                    int j = i - 1;

                    while (j >= 0 && arr[j] > key) {
                        arr[j + 1] = arr[j];
                        j = j - 1;
                    }
                    arr[j + 1] = key;
                }
                System.out.println("Insertion Sort completed.");
                break;
                
            default:
                System.out.println("Invalid option in sort menu.");
                break;
        }
    }
    
    // Method to find the maximum element in the array
    public void max() {
        if (arr != null && arr.length > 0) {
            int m = Arrays.stream(arr).max().getAsInt();
            System.out.println("Maximum Element = " + m);
        } else {
            System.out.println("Array is empty. Please input an array first.");
        }
    }
    
    // Method to find the minimum element (you can call this if needed)
    public void min() {
        if (arr != null && arr.length > 0) {
            int m = Arrays.stream(arr).min().getAsInt();
            System.out.println("Minimum Element = " + m);
        } else {
            System.out.println("Array is empty. Please input an array first.");
        }
    }
    public void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    public void search(){
        System.out.println("Enter data to find--");
        int data=scan.nextInt();
        scan.nextLine();
        System.out.println("1.Linear Search");
        System.out.println("2.Binary Search");
        String type=scan.nextLine();
        switch (type) {
            case "1":
            clearScreen();
            System.out.println("--Linear Search--");
            d.animate();
            int i;
            for(i=0;i<arr.length;i++){
                if(data==arr.length){
                    System.out.println("Data Fount at "+i);
                    break;
                }
            }
            if(i==arr.length)
            System.out.println("Data Dont Exists");
            break;
            case "2":
            clearScreen();
            System.out.println("--Binary Search--");
            d.animate();
            int s=0;
            int e=arr.length-1;
            int m;
            for(int k=0;k<arr.length;k++){
                for(int j=k+1;j<arr.length;j++){
                    int temp;
                    if(arr[k]>arr[j]){
                        temp=arr[k];
                        arr[k]=arr[j];
                        arr[j]=temp;
                    }

                }
            }
            boolean flag=true;
            while(s<=e){
                m=(s+e)/2;
                if(data>arr[m]){
                    e=m+1;

                }
                else if(data<arr[m]){
                    e=m-1;
                }
                else if(data==arr[m]){
                    System.out .println("Data Found at Index Number="+m);
                    break;
                }
                if(s>e){
                    flag=false;
                }
                
            }
            if(flag==false)System.out.println("data not found");
                break;
            default:
                break;
        }
    }
}
