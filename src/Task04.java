public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        for (int i = 0; i <= 1000; i++) {
            if (i % 15 == 0) {
                System.out.println(" hiss " + i);
            }
            if (i % 3 == 0) {
                System.out.println(" fizz " + i);
            }
            if (i % 5 == 0) {
                System.out.println(" buzz " + i);
            }
        }

    }
}
