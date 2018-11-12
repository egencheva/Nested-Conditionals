import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double number = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        if ("sofia".equals(town)) {
            if ("coffee".equals(product)) {
                price = number*0.5;
            } else if ("water".equals(product)) {
                price = number*0.8;
            } else if ("beer".equals(product)) {
                price = number * 1.2;
            } else if ("sweets".equals(product)) {
                price = number * 1.45;
            } else {
                price = number * 1.6;
            }
        }
        if ("plovdiv".equals(town)) {
            if ("coffee".equals(product)) {
                price = number*0.4;
            } else if ("water".equals(product)) {
                price = number*0.7;
            } else if ("beer".equals(product)) {
                price = number * 1.15;
            } else if ("sweets".equals(product)) {
                price = number * 1.30;
            } else {
                price = number * 1.5;
            }
        }
        if ("varna".equals(town)) {
            if ("coffee".equals(product)) {
                price = number*0.45;
            } else if ("water".equals(product)) {
                price = number*0.7;
            } else if ("beer".equals(product)) {
                price = number * 1.10;
            } else if ("sweets".equals(product)) {
                price = number * 1.35;
            } else {
                price = number * 1.55;
            }
        }
        System.out.printf("%.2f", price);
    }
}


//  System.out.printf("%.2f", price);