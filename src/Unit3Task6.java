import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[4];
        for(int i = 0;i<arr.length;i++){
           arr[i] = random.nextInt(10);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            if(i>0){
                if (arr[i-1]>arr[i]){
                    System.out.println("Последовательность не возрастает");
                    break;
                }
            }
            if (i==arr.length-1){
                System.out.println("Последовательность возрастает");
            }

        }
    }
}
