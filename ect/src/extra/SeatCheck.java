package extra;

import java.util.Scanner;
import java.util.Arrays;

public class SeatCheck
{

      private static final String occupied ="X";
      public static void main(String args[])
      {

       String[] line1 = {"A", "B", "C", "D"};
       String[] line2 = {"A", "B", "C", "D"};
       String[] line3 = {"A", "B", "C", "D"};
       String[] line4 = {"A", "B", "C", "D"};
       String[] line5 = {"A", "B", "C", "D"};
       String[] line6 = {"A", "B", "C", "D"};
       String[] line7 = {"A", "B", "C", "D"}; 
       String[] line = {"A", "B", "C","D"};
       System.out.println("There are the seates for you.");

       System.out.println("1   " + line1[0]+line1[1]+"\t" +line1[2] + line1[3]);
       System.out.println("2   " + line2[0]+line2[1]+"\t" +line2[2] + line2[3]);
       System.out.println("3   " + line3[0]+line3[1]+"\t" +line3[2] + line3[3]);
       System.out.println("4   " + line4[0]+line4[1]+"\t" +line4[2] + line4[3]);
       System.out.println("5   " + line5[0]+line5[1]+"\t" +line5[2] + line5[3]);
       System.out.println("6   " + line6[0]+line6[1]+"\t" +line6[2] + line6[3]);
       System.out.println("7   " + line7[0]+line7[1]+"\t" +line7[2] + line7[3]);

       int lineNumber=100;
       String seat ="";     
       Scanner keyboard = new Scanner(System.in);
      
        while(lineNumber !=0) {
    
          System.out.println("Enter the line number what you want to");
          lineNumber = keyboard.nextInt();

         switch(lineNumber)
         {
           case 1:
           line = Arrays.copyOf(line1, line1.length);
           break;

           case 2:
           line = Arrays.copyOf(line2, line2.length);
           break;
        
           case 3:
           line = Arrays.copyOf(line3, line3.length);
           break;

           case 4:
           line = Arrays.copyOf(line4, line4.length);
           break;
        
           case 5:
           line = Arrays.copyOf(line5, line5.length);
           break;

           case 6:
           line = Arrays.copyOf(line6, line6.length);
           break;
     
           case 7:
           line = Arrays.copyOf(line7, line7.length);
           break;


           default:
           System.out.println("You enter the wrong number!");
           break;            
         }// end switch 

           if(line[0] !=null)
             System.out.println("Enter the Seat code What you want to");
             seat = keyboard.next();
          
                 for(int index =0; index < line.length; index++)
                  {
                     
                    
                      if(seat.equals(line[index]) && !line[index].equals("X"))
                        line[index] = occupied;
                     
                       
                   }// end for loop
                  switch(lineNumber)
         {
           case 1:
           line1 = Arrays.copyOf(line, line.length);
           break;

           case 2:
           line2 = Arrays.copyOf(line, line.length);
           break;
        
           case 3:
           line3 = Arrays.copyOf(line, line.length);
           break;

           case 4:
           line4 = Arrays.copyOf(line, line.length);
           break;
        
           case 5:
           line5 = Arrays.copyOf(line, line.length);
           break;

           case 6:
           line6 = Arrays.copyOf(line, line.length);
           break;
     
           case 7:
           line7 = Arrays.copyOf(line, line.length);
           break;


           default:
           System.out.println("You enter the wrong number!");
           break;            
         }// end switch


       System.out.println("1   " + line1[0]+line1[1]+"\t" +line1[2] + line1[3]);
       System.out.println("2   " + line2[0]+line2[1]+"\t" +line2[2] + line2[3]);
       System.out.println("3   " + line3[0]+line3[1]+"\t" +line3[2] + line3[3]);
       System.out.println("4   " + line4[0]+line4[1]+"\t" +line4[2] + line4[3]);
       System.out.println("5   " + line5[0]+line5[1]+"\t" +line5[2] + line5[3]);
       System.out.println("6   " + line6[0]+line6[1]+"\t" +line6[2] + line6[3]);
       System.out.println("7   " + line7[0]+line7[1]+"\t" +line7[2] + line7[3]);

     }// end while

        }// end main
}//end class