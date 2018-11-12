import java.util.Scanner;

public class PointOnBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //x1, y1, x2, y2, x и y (като се гарантира, че x1 < x2 и y1 < y2).
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean isOnBorder = false;

        if ((x == x1) || (x == x2)) {
            if (y >= Math.min(y1, y2) && y <= Math.max(y1, y2)) {
                isOnBorder = true;
            }
        }
        if ((y == y1) || (y == y2)) {
            if (x >= Math.min(x1, x2) && x <= Math.max(x1, x2)) {
                isOnBorder = true;
            }
        }
        if (isOnBorder) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}