import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание 5");
        Scanner sc = new Scanner(System.in);
      double dist = 0;
      double x;
      double y;
      int days = 0;
        System.out.println("Введите x: ");
        x= sc.nextDouble();
        System.out.println("Введите y: ");
        y= sc.nextDouble();
        while (dist < y) {
            dist += x;
            x *=1.1;
            days++;
            System.out.println(days + "days");
        }

    }
}
