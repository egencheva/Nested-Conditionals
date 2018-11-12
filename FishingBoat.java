import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double rent = 0.0;
        double discount = 0.0;
        double finalPrice = 0.0;
        boolean isEven = fishermen % 2 == 0;

        switch (season) {
            case "spring":
                rent = 3000;
                break;
            case "summer":
                rent = 4200;
                break;
            case "autumn":
                rent = 4200;
                break;
            case "winter":
                rent = 2600;
                break;
        }
        if (fishermen <= 6) {
            discount = rent * 0.10;
        } else if (fishermen >= 7 && fishermen <= 11) {
            discount = rent * 0.15;
        } else if (fishermen >= 12) {
            discount = rent * 0.25;
        }

        finalPrice = rent - discount;

        if (isEven) {
            if (season.equals("summer") || season.equals("spring") || season.equals("winter"))
                finalPrice = (rent - discount) * 0.95;
        }

        if (budget - finalPrice < 0) {
            System.out.printf("Not enough money! You need %.2f leva.", finalPrice - budget);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", budget - finalPrice);
        }
    }
}
