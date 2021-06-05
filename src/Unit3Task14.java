import java.util.Random;

public class Unit3Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[9];

        for(int i = 0; i<arr.length-1; i++){
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        for(int i = 0; i<arr.length-1;i++){

            if(arr[i] < arr[i+1] && i%2==0){
                min = arr[i];
            }

        }
        System.out.println(min);
    }
}
