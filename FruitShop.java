import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weekDay = scanner.nextLine().toLowerCase();
        String product = scanner.nextLine().toLowerCase();
        double number = Double.parseDouble(scanner.nextLine());
        double price = -1;
        double cost = 0.0;
        boolean isProduct = (product.equals("banana") || product.equals("apple") || product.equals("orange") || product.equals("grapefruit") || product.equals("kiwi") || product.equals("pineapple") || product.equals("grapes"));
        boolean isWeekday = (weekDay.equals("monday") || weekDay.equals("tuesday") || weekDay.equals("wednesday") || weekDay.equals("grapefruit") || weekDay.equals("friday"));

        if (isProduct){
            System.out.print(weekDay);
        }
        if (weekDay.equals("monday") || weekDay.equals("tuesday") || weekDay.equals("wednesday") || weekDay.equals("thirsday") || weekDay.equals("friday")) {
            if (product.equals("banana")) {
                price = 2.50;
            } else if (product.equals("apple")) {
                price = 1.20;
            } else if (product.equals("orange")) {
                price = 0.85;
            } else if (product.equals("grapefruit")) {
                price = 1.45;
            } else if (product.equals("kiwi")) {
                price = 2.70;
            } else if (product.equals("pineapple")) {
                price = 5.50;
            } else if (product.equals("grapes")) {
                price = 3.85;
            }
        }
        if (weekDay.equals("sunday") || weekDay.equals("saturday")) {
            if (product.equals("banana")) {
                price = 2.70;
            } else if (product.equals("apple")) {
                price = 1.25;
            } else if (product.equals("orange")) {
                price = 0.90;
            } else if (product.equals("grapefruit")) {
                price = 1.60;
            } else if (product.equals("kiwi")) {
                price = 3.00;
            } else if (product.equals("pineapple")) {
                price = 5.60;
            } else if (product.equals("grapes")) {
                price = 4.20;
            }
        }


    }


}
