import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double priceFlower = 0.00;
        double price = 0.00;


        switch (flower) {
            case "Roses":
                priceFlower = 5;
                break;
            case "Dahlias":
                priceFlower = 3.8;
                break;
            case "Tulips":
                priceFlower = 2.8;
                break;
            case "Narcissus":
                priceFlower = 3.0;
                break;
            case "Gladiolus":
                priceFlower = 2.5;
                break;
        }

        if (flower.equals("Roses") && (number > 80)) {
            price = number * priceFlower * 0.9;
        } else if (flower.equals("Dahlias") && (number > 90)) {
            price = number * priceFlower * 0.85;
        } else if (flower.equals("Tulips") && (number > 80)) {
            price = number * priceFlower * 0.85;
        } else if (flower.equals("Narcissus") && (number < 120)) {
            price = number * priceFlower * 1.15;
        } else if (flower.equals("Gladiolus") && (number < 80)) {
            price = number * priceFlower * 1.2;
        } else {
            price = number * priceFlower;
        }

        if (budget - price < 0) {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
        if (budget - price >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, budget - price);
        }
    }
}





