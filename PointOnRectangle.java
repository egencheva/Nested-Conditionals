import java.util.Scanner;

public class PointOnRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean isInside = false;

        if (x >= Math.min(x1, x2) && x <= Math.max(x1, x2)) {
            if (y >= Math.min(y1, y2) && y <= Math.max(y1, y2)) {
                isInside = true;
            }
        }
        if (isInside) {
            System.out.print("Inside");
        } else {
            System.out.print("Outside");
        }
    }
}


