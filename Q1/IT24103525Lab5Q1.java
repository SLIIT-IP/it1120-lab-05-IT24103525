import java.util.Scanner;

public class IT24103525Lab5Q1 
{
    public static void main(String[]args) 
  {

     //variable decleration
     int max,min;
     
     //create a scanner object to read inputs
     Scanner input = new Scanner(System.in);
      
     System.out.print("Enter the first integer: " );
     int number1 = input.nextInt();

     System.out.print("Enter the first integer: " );
     int number2 = input.nextInt();

     System.out.print("Enter the first integer: " );
     int number3 = input.nextInt();

     System.out.println("\nUser enterd numbers are : " + number1+" "+number2+" "+number3); 
     
     //compare integers
     if(number1>number2)
     {
       max = number1;
       min = number2;
     }
     else
     {
      max = number2;
      min = number1;
     }

    if (number3>max)
    {
     max = number3;
    }
    else
    {
     max = max;
     min = number3;
    }
     
    //display output
    System.out.println("The smallest number is : "+ min);
    System.out.println("The largest number is : "+ max);
  }

}
    




   
      
  
     