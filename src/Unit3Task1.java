public class Unit3Task1 {
    public static void main(String[] args) {
        int a = 0;
        for(int i = 2; i<=20; i++)
            if(i%2==0){
                a++;
            }
        int[] arr = new int[a];
            for(int i = 2, b = 0; i<=20;i++){
                if(i%2==0){
                    arr[b] = i;
                    System.out.print(arr[b] + " ");
                    b++;
                }
            }
        System.out.println();
            System.out.println("-------------------------");
            for(int i = 0;i < arr.length; i++){
                System.out.println(arr[i]);
            }
    }
}
