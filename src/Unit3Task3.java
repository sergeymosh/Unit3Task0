import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[14];
        Random random = new Random();
        for(int i = 0;i<=arr.length - 1;i++){
            arr[i] = random.nextInt(99);
            if (arr[i]%2==0){
                count+=1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Чётных элементов в массиве: " + count);
    }
}
