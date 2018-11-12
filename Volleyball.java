import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine()); //брой празници в годината (които не са събота и неделя).
        double h = Double.parseDouble(scanner.nextLine());//пътува до родния си град h пъти
        double weekend = 48;
        double playSf = (weekend - h) * 3 / 4;
        double playHolidays = p * 2 / 3;
        double play = playSf + h + playHolidays;


        if (year.equals("leap")) {
            play = Math.floor(play * 1.15);
            System.out.println(play);
        } else if (year.equals("normal")) {
            play = Math.floor(play);
            System.out.println(play);
        }

    }
}
