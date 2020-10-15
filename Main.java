
public class Main {
  public static void main(String[] args)
   {
     int astroNauts = 8;
      boolean theHelmets = false;
      //Try making it false. You can change the outcome!!!
     System.out.print("There are " + astroNauts + " astronauts, ");
     
     if (theHelmets)
     {
         System.out.println("There aren't enough helmets,");
         System.out.print("The launch cannot commence.");
     }
     else
     {
         System.out.println("There are enough helmets for each astronaut!");
         System.out.print("They are loading into the spaceship...");

         //type "10 minutes later.."
      int finalNumber = 1;
      int count = 10;
        System.out.println("We are launching in ");

     //
      while (count >= 2)
     {
        
        System.out.print(count);
        //
        count--;
        System.out.println("..");

        
       }
       System.out.println(finalNumber + "..");
     }
     


     
       //type liftoff to complete the code!!
   }
}