import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Double pineapple = 2.14;
        Double apple = 3.67;
        Double tomato = 1.11;
        Double banana = 0.95;
        Double aubergine = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("How many weight Pineapple : ");
        double tPineapple = pineapple*input.nextDouble();
        System.out.print("how many weight Apple : ");
        double tApple = apple*input.nextDouble();
        System.out.print("How many weight Tomato : ");
        double tTomato = tomato*input.nextDouble();
        System.out.print("How many weight Banana : ");
        double tBanana = banana*input.nextDouble();
        System.out.print("How many weight Aubergine : ");
        double tAubergine = aubergine*input.nextDouble();
        double total = tAubergine+tBanana+tTomato+tPineapple+tApple;
        System.out.println("Total cost is : " + total + " TL");
    }
}
