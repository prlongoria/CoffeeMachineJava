import java.util.Scanner;

public class EnoughCoffee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many ml of water the coffee machine has?");
        int waterRemain = input.nextInt();
        System.out.println("Agua:" + waterRemain);
        System.out.println("How many ml of milk the coffee machine has?");
        int milkRemain = input.nextInt();
        System.out.println("leche:" + milkRemain);
        System.out.println("How many g of coffee the coffee machine has?");
        int beansCoffeeRemain = input.nextInt();
        System.out.println("cafe:" + beansCoffeeRemain);
        System.out.println("How many cups of cofee you will need?");
        int cupsWanted = input.nextInt();
        System.out.println("tazas:" + cupsWanted);
        
        if (waterRemain >= (200 * cupsWanted) && milkRemain >= (25 * cupsWanted) && beansCoffeeRemain >= (15 * cupsWanted)) {
            // int cupsICanMake = 
            System.out.println("I can make that amount of coffee");
        }
        if (waterRemain <  (200 * cupsWanted) || milkRemain < (25 * cupsWanted) || beansCoffeeRemain < (15 * cupsWanted)) {
        System.out.println("I can´t make any cup of coffee");
        }

        
    }   
}
//NO:
// how many ml of water the coffee machine has: 500

// how many ml of milk the coffee machine has: 250

// how many grams of coffee beans the coffee machine has: 200

// how many cups of coffee you will need: 10

// No, I can make only 2 cup(s) of coffee

//SI:
// how many ml of water the coffee machine has: 1550

// how many ml of milk the coffee machine has: 299

// how many grams of coffee beans the coffee machine has: 300

// how many cups of coffee you will need: 3

// Yes, I can make that amount of coffee (and even 2 more than that)
