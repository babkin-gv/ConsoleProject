import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<num;i++){
            System.out.print("Get a number: ");
            arr[i] = in.nextInt();
        }
        System.out.printf("Your number: %d \n", num);
        in.close();

    }
}