public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание 9");
        int num = 5;
        for (int i = 31; i >=0 ; i--) {
            int bit = (num >> i) & 1;
            System.out.print(bit);
        }
    }
}



