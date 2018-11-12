import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        double price = 0.0;

        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
        } else if (budget > 1000) {
            System.out.println("Somewhere in Europe");
        } else {
            System.out.println("Somewhere in Balkans");
        }
        if (budget <= 100) {
            if (season.equals("summer")) {
                price = budget * 0.3;
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                System.out.printf("Hotel - %.2f", price);
            }
        }
        if (budget > 100 && budget <= 1000) {
            if (season.equals("summer")) {
                price = budget * 0.4;
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                System.out.printf("Hotel - %.2f", price);
            }
        } else if (budget > 1000) {
            if (season.equals("summer") || season.equals("winter")) {
                price = budget * 0.9;
                System.out.printf("Hotel - %.2f", price);

            }
        }
    }
}

