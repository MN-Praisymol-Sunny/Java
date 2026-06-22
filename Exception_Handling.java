import java.io.*;
import java.util.Scanner;
public class Exception_Handling {
     static void readFile() throws IOException
    {
        FileReader text = new FileReader("Patttern.java");
        System.out.println("File Opened");
    }


   public static void main(String[] args) {
    try{
        readFile();
    }
    catch (IOException e){
        System.out.println("Something went wrong");
    }
    /*Scanner get=new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age=get.nextInt();
    if(age<18){
        throw new ArithmeticException("Not Eligible to vote");
    }
    System.out.println("The person can vote");*/
   
   } 
}
