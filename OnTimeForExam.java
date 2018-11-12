import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());
        int examTime = examHour * 60 + examMin;
        int arriveTime = arriveHour * 60 + arriveMin;
        int Hour = (examTime - arriveTime) / 60;
        int Min = (examTime - arriveTime) % 60;
        // System.out.printf("%d:%02d",Hour,Min);
        // System.out.printf("%d:%02d",Hour,Min);

        if (arriveTime > examTime) {
            System.out.println("Late");
        } else if (arriveTime == examTime || examTime - arriveTime <= 30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }
        if ((examTime - arriveTime) > 0 && (examTime - arriveTime) < 60) {
            System.out.printf("%d minutes before the start", examTime - arriveTime);
        } else if (examTime - arriveTime > 0 && (examTime - arriveTime >= 60)) {
            System.out.printf("%d:%02d hours before the start", Hour, Min);
        } else if ((arriveTime - examTime) > 0 && (arriveTime - examTime) < 60) {
            System.out.printf("%d minutes after the start", arriveTime - examTime);
        } else
            System.out.printf("%d:%02d hours after the start", (arriveHour - examHour), (arriveMin - examMin));
    }
}



