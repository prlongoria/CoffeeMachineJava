import java.util.Scanner;
public class Action {
    public static void main(String[] args) {
        
        int water = 500;
        int milk = 250;
        int coffeeBeans = 31;
        int disposableCups = 2;
        int money = 500;
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
                case "1":
                    
                    int waterForExpresso = 250;
                    int milkForExpresso = 0;
                    int coffeeBeansForExpresso = 16;
                    int moneyForExpresso = 4;
                    int disposableCupsRemain = disposableCups - 1;

                    int waterRemain = water - waterForExpresso;
                    int milkRemain = milk - milkForExpresso;
                    int coffeeBeansRemain = coffeeBeans - coffeeBeansForExpresso;
                    int moneyRemain = money - moneyForExpresso;

                    System.out.println("The coffee machine has: ");
                    System.out.println(waterRemain + " of water ");
                    System.out.println(milkRemain + " of milk ");
                    System.out.println(coffeeBeansRemain + " of coffee beans ");
                    System.out.println(disposableCupsRemain + " of disposable cups ");
                    System.out.println(moneyRemain + " of money");
                    break;
            
                    case "2":
                    int waterForlatte = 350;
                    int milkForlatte = 75;
                    int coffeeBeansForlatte = 20;
                    int moneyForlatte = 7;
                    
                    int waterRemainLatte = water - waterForlatte;
                    int milkRemainLatte = milk - milkForlatte;
                    int coffeeBeansRemainLatte = coffeeBeans - coffeeBeansForlatte;
                    int moneyRemainLatte = money - moneyForlatte;
                    int disposableCupsRemainLatte = disposableCups - 1;


                    System.out.println("The coffee machine has: ");
                    System.out.println(waterRemainLatte + " of water ");
                    System.out.println(milkRemainLatte + " of milk ");
                    System.out.println(coffeeBeansRemainLatte + " of coffee beans ");
                    System.out.println(disposableCupsRemainLatte + " of disposable cups ");
                    System.out.println(moneyRemainLatte + " of money");
                    break;

                    case "3":
                    int waterForcappuccino = 200;
                    int coffeeBeansForcappuccino = 12;
                    int milkForcappuccino = 100;
                    int moneyForcappuccino = 6;
                    
                    int waterRemainCapuccino = water - waterForcappuccino;
                    int milkRemainCapuccino = milk - milkForcappuccino;
                    int coffeeBeansRemainCapuccino = coffeeBeans - coffeeBeansForcappuccino;
                    int moneyRemainCapuccino = money - moneyForcappuccino;
                    int disposableCupsRemainCapuccino = disposableCups - 1;


                    System.out.println("The coffee machine has: ");
                    System.out.println(waterRemainCapuccino + " of water ");
                    System.out.println(milkRemainCapuccino + " of milk ");
                    System.out.println(coffeeBeansRemainCapuccino + " of coffee beans ");
                    System.out.println(disposableCupsRemainCapuccino + " of disposable cups ");
                    System.out.println(moneyRemainCapuccino + " of money");
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
