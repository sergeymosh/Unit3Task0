import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.print("Первый массив: ");
        int sum1 = 0;
        int sum2 = 0;
        float sr1 = 0;
        float sr2 = 0;
        for (int i = 0;i< arr1.length;i++){
            arr1[i] = random.nextInt(15);
            System.out.print(arr1[i] + " ");
            sum1+=arr1[i];

        }
        System.out.println();
        System.out.print("Второй массив: ");
        for (int i = 0;i< arr2.length;i++){
            arr2[i] = random.nextInt(15);
            System.out.print(arr2[i] + " ");
            sum2+=arr2[i];

        }
        System.out.println();
        sr1 = sum1/5;
        sr2 = sum2/5;
        if(sr1>sr2){
            System.out.println("Первый массив больше");
        } else if(sr1<sr2){
            System.out.println("Второй массив со больше");
        } else{
            System.out.println("Массивы равны");
        }

    }
}
