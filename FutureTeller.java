import java.util.Random;
import java.util.Scanner;
public class FutureTeller
{  public static void main(String args[])
   {
     Random BRO = new Random();
     Scanner YO = new Scanner(System.in);
     int number;
     String name;
     
     System.out.println("ENTER YOUR NAME");
     name = YO.nextLine();
     
     System.out.println("HELLO, " + name +"!" + " LET'S SEE UR FUTURE!");
     System.out.println("");
     System.out.println("A DICE WILL BE ROLLED, BASED ON THE NUMBER, UR FUTURE WILL BE DECIDED!");
     System.out.println("");
     number = BRO.nextInt(6);
     
     int SP [] = {0,1,2,3,4,5};
     
     if (number == SP[0]){
           System.out.println("OMG IT'S 1! UR GOING TO BE FUTURE AMBANI, " + name);
        }
     else {
          }   
        
     if(number == SP[1]){
           System.out.println("OMG IT'S 2! UR GOING TO HAVE POWER OF HERCULES/SHE-HULK, " + name);
        }
     else{} 
     
     if (number == SP[2]){
           System.out.println("OMG IT'S 3! UR GOING TO LIVE OVER 90 YEARS " + name +", EMBRACE URSELF");
        }
     else{}
     
     if(number == SP[3]){
           System.out.println("OMG IT'S 4! UR GOING TO MARRY THE GUY/GAL OF UR CHOICE. JUST WAIT FOR THE RIGHT TIME " + name + " ..");
        }
     else{}
     
     if(number == SP[4]){
           System.out.println("OMG IT'S 5! UR GOING TO LIVE UR LIFE TO THE FULLEST FROM NOW ON " + name + "!");
        }
     else{}
     
     if(number == SP[5]){
           System.out.println("OMG IT'S 6! UR TABLES OF LUCK ARE SOON GOING TO BE FLIPPED " + name + "!");
        }
     else{}
   }
}
