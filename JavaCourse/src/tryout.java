import java.util.Scanner;

public class tryout {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr
                    [i]);
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println("Max " + max);
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];

            }

        }
        System.out.println("Min " + min);
  getIndex(arr,100);

    }
    public static void  getIndex(int[] arr, int indexEle) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == indexEle) {
                System.out.println(j);
            }
        }
    }


}
