import java.util.Arrays;
import java.util.Scanner;

public class CombineArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[7];
        int size1=0;
        int[] arr2 = new int[5];
        int size2=0;
        System.out.println("Nhập các phần tử cho mảng 1:");
        for (int i = 0; i <7; i++) {
            int element = input.nextInt();
            size1 = addElements(arr1,element,size1);
        }
        System.out.println("Mảng 1: "+ Arrays.toString(arr1));
        System.out.println("Nhập các phần tử cho mảng 2:");
        for (int i = 0; i <5; i++) {
            int element = input.nextInt();
            size2 = addElements(arr2,element,size2);
        }
        System.out.println("Mảng 2: "+ Arrays.toString(arr2));
        int[] arr3 = new int[12];
        int size3 =0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[size3+i]=arr1[i];
        }
        System.out.println("Mảng 3 sau khi được mảng 1 gộp vào: "+Arrays.toString(arr3));
        for (int i = 0; i < arr2.length; i++) {
            arr3[size1+i]=arr2[i];
        }
        System.out.println("Mảng 3 sau khi được mảng 1 và mảng 2 gộp vào: "+Arrays.toString(arr3));
    }
    public static int addElements(int[] arr, int element, int size){
        arr[size]= element;
        size++;
        return size;
    }
}
