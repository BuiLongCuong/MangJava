import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//        System.out.println("Nhập độ dài của mảng:");
//        int length = input.nextInt();
//        int[] arr = new int[length];
//        int size =0;
//        while (size!=length){
//            System.out.println("Mời bạn nhập phần tử thứ "+ size);
//            int element = input.nextInt();
//            arr[size]= element;
//            size++;
//        }
//        System.out.println(Arrays.toString(arr));


        int[] arr = new int[7];
        int size = 0;
        size = addElement(arr, -3, size); // 1
        size = addElement(arr, 99, size);
        size = addElement(arr, 69, size);
//        size = addElement(arr, -5, size);
//        size = addElement(arr, -7, size);

//        System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println("Size mảng là: " + size);
        System.out.println("Vị trí cả phần tử 99 là: " + searchByElement(arr, 99, size));
//
        size = delete(arr, 69, size);
        System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));
        System.out.println("Size mảng là: " + size);
    }
    public static int addElement(int[] arr, int element, int size) {
        arr[size] = element;
        size++;
        return size;
    }

    public static int delete(int[] arr, int element, int size) {
        int index = searchByElement(arr, element, size);
        for (int i = index; i < size -1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size-1]=0;
        size--;
        return size;
    }
        public static int searchByElement(int[] arr, int elementSearch, int size) {
            for (int i = 0; i < size; i++) {
                if(elementSearch == arr[i]) {
                    return i;
                }
            }
            return -1;
        }

}