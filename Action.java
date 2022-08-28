import java.util.Scanner;
public class Action {
    public static void main(String[] args) {
        
        int water = 0;
        int milk = 0;
        int coffeeBeans = 0;
        int disposableCups = 0;
        int money = 0;
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water ");
        System.out.println(milk + " of milk ");
        System.out.println(coffeeBeans + " of coffee beans ");
        System.out.println(disposableCups + " of disposable cups ");
        System.out.println(money + " of money");
        System.out.println("Write an action (buy, fill, take): ");
        Scanner input = new Scanner(System.in);
        String action = input.next();
        
        switch (action) {
            case "buy":
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            String typeOfCoffee = input.next();
            System.out.println(typeOfCoffee);
            break;
            case "fill":
            System.out.println("Write how many ml of water do you want to add: ");
            int quantityOfWater = input.nextInt();
            water = water + quantityOfWater;
            System.out.println("The coffee machine has:");
            System.out.println(water + " ml of water");
            System.out.println("Write how many ml of milk do you want to add: ");
            int quantityOfMilk = input.nextInt();
            milk = milk + quantityOfWater;
            System.out.println(milk + " ml of milk");
            break;
        }
    }
}
