import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine().toLowerCase();

        if (age < 16) {
            if (gender.equals("m")) {
                System.out.print("Master");
            }
            if (gender.equals("f")) {
                System.out.print("Miss");
            }
        }
            if (age >= 16) {
                if (gender.equals("m")) {
                    System.out.print("Mr.");
                }
                if (gender.equals("f")) {
                    System.out.print("Ms.");
                }
            }
        }
    }

