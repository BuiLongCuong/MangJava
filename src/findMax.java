import java.util.Arrays;
import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập các phần tử:");
        int[] arr = new int[7] ;
        int size =0;
        for (int i = 0; i < 7; i++) {
            int element = input.nextInt();
            size = addElements(arr,element,size);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: "+ max);
    }
    public static int addElements(int[] arr, int element, int size){
        arr[size]=element;
        size++;
        return size;
    }
}
