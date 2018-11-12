import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grades = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        String Outfit = "";
        String Shoes = "";


        if (10 <= grades && grades <= 18) {
            if ("Morning".equals(dayTime)) {
                Outfit = "Sweatshirt";
                Shoes = "Sneakers";
            } else if ("Afternoon".equals(dayTime)) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if ("Evening".equals(dayTime)) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }
        if (18 < grades && grades <= 24) {
            if ("Morning".equals(dayTime)) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if ("Afternoon".equals(dayTime)) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            } else if ("Evening".equals(dayTime)) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }
        if (grades >= 25) {
            if ("Morning".equals(dayTime)) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            } else if ("Afternoon".equals(dayTime)) {
                Outfit = "Swim Suit";
                Shoes = "Barefoot";
            } else if ("Evening".equals(dayTime)) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", grades, Outfit, Shoes);
    }

}


