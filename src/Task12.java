public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание 12");
        int maxRange = 20; // 20
        int [] lst = new int[maxRange]; // 20 max
        for (int i = 0; i < maxRange; i++) {
            lst[i] = maxRange - i;
            // System.out.print(lst[i] + "\t");
        }
        int count = 0;
        int sum = maxRange;
        int lstCount = lst[count];
        while (lstCount!= 1){
            int tmp = sum;
            while (sum% lstCount != 0){
                sum+= tmp;
            }
            count++;
            lstCount = lst[count];
        }
        System.out.println(sum);

    }
}
