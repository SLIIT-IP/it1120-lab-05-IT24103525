import java.util.Scanner;

public class IT24103525Lab5Q2 
{
    public static void main(String[]args) 
  {
     
     //create a scanner object to read inputs
     Scanner input = new Scanner(System.in);
      
     System.out.print("Enter the number of new members introduced: " );
     int number1 = input.nextInt();
     
     if(number1>=0)
      {
       switch(number1)
        {
         case 0:
              System.out.println("\nNo prize");
              break;

         case 1:
              System.out.println("\nPrice is a : Pen");
              break;

         case 2:
              System.out.println("\nPrice is a : Umbrella");
              break;

         case 3:
              System.out.println("\nPrice is a : Bag");
              break;
    
         case 4:
              System.out.println("\nPrice is a : Travelling Chair");
              break;

         default:
              System.out.println("\nPrice is a : Headphone");
       }

      }

     else
      {
       System.out.println("\nInput must be a number 0 or greater");
      }
      
   }

}

       

              
