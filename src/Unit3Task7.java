import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = arr[0];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }


        }
        System.out.println("максимальный элемент - "+ max);
        System.out.println("индекс маскимального элемента - "+ index);
    }
}
