import java.util.Scanner;

public class IT24103525Lab5Q3
{
    public static void main(String[]args) 
  {
     //variable decleration
     final double ROOM_CHARGE = 48000.0;

     final double ROOM_4_3 = 0.1;

     final double ROOM_5 = 0.2;
   
     int startD,endD,numD;



     //create a scanner object to read inputs
     Scanner input = new Scanner(System.in);
      
     System.out.print("Enter Start Date (1-31): ");
     startD = input.nextInt();
   
     System.out.print("Enter End Date (1-31): ");
     endD = input.nextInt();
   
     numD = endD - startD;
  
     //date validation1
     if (startD<=1||startD>=31||endD<=1||endD>=31)
      {
       System.out.print("Error: Date must be between 1 and 31 ");

       return;
      }
     
     //date validation1
     if (endD<=startD)
      {
       System.out.print("Error: Start Date must be less than End Date ");

       return;
      }

     //calculation & display total amount
     if (numD<3)
      {
       System.out.println("\nRoom Charge Per Day: Rs. "+ ROOM_CHARGE+"/=");
       System.out.println("Number of Days Reserved: "+ numD);
       System.out.println("Total Amount to be Paid: "+ ROOM_CHARGE*(numD));

       return;
      }

     if(numD>=3&&numD<=4)
      {
       System.out.println("\nRoom Charge Per Day: Rs. "+ ROOM_CHARGE+"/=");
       System.out.println("Number of Days Reserved: "+ numD);
       System.out.println("Total Amount to be Paid: "+ (ROOM_CHARGE*(numD) - (ROOM_CHARGE*(numD)*ROOM_4_3)));
      }

     else
      {
       System.out.println("\nRoom Charge Per Day: Rs. "+ ROOM_CHARGE+"/=");
       System.out.println("Number of Days Reserved: "+ numD);
       System.out.println("Total Amount to be Paid: "+ (ROOM_CHARGE*(numD) - (ROOM_CHARGE*(numD)*ROOM_5)));
      }

  }

}


