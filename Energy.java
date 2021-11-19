   /*
   * The EnergyFormula program
   *
   * @author  Liam Fletcher
   * @version 1.0
   * @since   2021-11-19  
   */
   
   // Some info found on: https://www.javatpoint.com/java-math
   
   import java.lang.Math;
  import java.util.Scanner;
  
  public class Energy {
    /**
     * This class is what calculates the energy released.
     */
    public static void main(String[] args) {
      //Constant
      final double speedOfLight = 299800000;
  
      try {
        // Create a Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mass of an object in kilograms: ");
  
        // user input 
        double mass = scan.nextDouble();
  
        //Close Scanner
        scan.close();
  
        // Calculates energy 
        double energy = (mass * Math.pow(speedOfLight, 2));
  
        // Prints answer
        System.out.println("The object would release:");
        System.out.println(energy + " joules of energy.");
        System.out.println("Done.");
  
      // Catches invalid 
      } catch (Exception e) {
        System.out.println("Invaild Input");
      }
    }
  }
