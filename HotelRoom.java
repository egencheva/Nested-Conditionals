import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine().toLowerCase();
        int overNihght = Integer.parseInt(scanner.nextLine());
        String room = "";
        double priceStudio = 0.00;
        double priceApartm = 0.00;
        double priceDiscountApartm = 0.00;
        double priceDiscountStudio = 0.00;

        switch (month) {
            case "may":
                priceStudio = 50;
                priceApartm = 65;
                break;
            case "october":
                priceStudio = 50;
                priceApartm = 65;
                break;
            case "june":
                priceStudio = 75.20;
                priceApartm = 68.70;
                break;
            case "september":
                priceStudio = 75.20;
                priceApartm = 68.70;
                break;
            case "july":
                priceStudio = 76;
                priceApartm = 77;
                break;
            case "august":
                priceStudio = 76;
                priceApartm = 77;
                break;
        }
        if (overNihght <= 7) {
            priceDiscountApartm = priceApartm * 1 * overNihght;
            priceDiscountStudio = priceStudio * 1 * overNihght;
            System.out.printf("Apartment: %.2f lv.%n", priceDiscountApartm);
            System.out.printf("Studio: %.2f lv.", priceDiscountStudio);
        }
        if (overNihght > 14) {
            if (month.equals("june") || month.equals("september")) {
                priceDiscountStudio = priceStudio * 0.8 * overNihght;
                priceDiscountApartm = priceApartm * 0.9 * overNihght;
                System.out.printf("Apartment: %.2f lv. %n", priceDiscountApartm);
                System.out.printf("Studio: %.2f lv.", priceDiscountStudio);
            }
        }
        if (overNihght > 14) {
            if (month.equals("may") || month.equals("october")) {
                priceDiscountStudio = priceStudio * 0.7 * overNihght;
                priceDiscountApartm = priceApartm * 0.9 * overNihght;
                System.out.printf("Apartment: %.2f lv.%n", priceDiscountApartm);
                System.out.printf("Studio: %.2f lv.", priceDiscountStudio);
            }
        }
        if (overNihght > 14) {
            if (month.equals("july") || month.equals("august")) {
                priceDiscountStudio = priceStudio * 1 * overNihght;
                priceDiscountApartm = priceApartm * 0.9 * overNihght;
                System.out.printf("Apartment: %.2f lv.%n", priceDiscountApartm);
                System.out.printf("Studio: %.2f lv.", priceDiscountStudio);
            }
        }
        if (overNihght > 7 && overNihght <= 14) {
            if (month.equals("may") || month.equals("october")) {
                priceDiscountStudio = priceStudio * 0.95 * overNihght;
                priceDiscountApartm = priceApartm * 1 * overNihght;
                System.out.printf("Apartment: %.2f lv.%n", priceDiscountApartm);
                System.out.printf("Studio: %.2f lv.", priceDiscountStudio);
            }
        }
        if (overNihght > 7 && overNihght <= 14) {
            if (month.equals("june") || month.equals("july") || month.equals("august") || month.equals("september")) {
                priceDiscountStudio = priceStudio * 1 * overNihght;
                priceDiscountApartm = priceApartm * 1 * overNihght;
                System.out.printf("Apartment: %.2f lv.%n", priceDiscountApartm);
                System.out.printf("Studio: %.2f lv.", priceDiscountStudio);
            }
        }
    }
}
