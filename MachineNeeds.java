import java.util.Scanner;

public class MachineNeeds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many cups of cofee you will need?");
        int cupsWanted = input.nextInt();

        int waterNeeded = 200 * cupsWanted;
        int milkNeeded = 25 * cupsWanted;
        int coffeeBeansNeeded = 15 * cupsWanted;

        System.out.println("For " + cupsWanted + " cups of coffee you will need: ");
        System.out.println( waterNeeded + " ml of water");
        System.out.println( milkNeeded + " ml of milk");
        System.out.println( coffeeBeansNeeded + " g of coffee beans");
        
            
    }    
}


//how many cups of coffee you will need: 25

// For 25 cups of coffee you will need:

// 5000 ml of water

// 1250 ml of milk

// 375 g of coffee beans