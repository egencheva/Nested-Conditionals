import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа
        String Type = scanner.nextLine();
        int numRows = Integer.parseInt(scanner.nextLine());
        int numColmn = Integer.parseInt(scanner.nextLine());
        double Price = 0.0;

        if (Type.equals("Premiere")) {
            Price = 12.00;
            System.out.printf("%.2f %n", Price * numRows * numColmn);
            System.out.print("leva");
        } else if(Type.equals("Normal")){
                Price = 7.50;
                System.out.printf("%.2f %n", Price * numRows * numColmn);
                System.out.print("leva");
            }else if (Type.equals("Discount")){
            Price = 5.00;
            System.out.printf("%.2f %n", Price * numRows * numColmn);
            System.out.print("leva");
        }
    }
}