import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        int[] arr = new int [20];
        Random random = new Random();
        for(int i = 0; i <=arr.length - 1;i++){
            arr[i] = random.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0;i<=arr.length - 1;i++){
            if (i % 2 == 0){
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
