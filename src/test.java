import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập độ dài của mảng: ");
//        int length = input.nextInt();
//        int[] arr= new int[length];
//        int size =0;
//        while( size!= length){
//            System.out.println("Nhập phần tử thứ : "+ size);
//            int element = input.nextInt();
//            arr[size]=element;
//            size++;
//        }
//        System.out.println(Arrays.toString(arr));

//        int[] arr = new int[7];
//        int size =0;
//
//        size = addElements(arr, -3, size);
//        size = addElements(arr, 5, size);
//        size = addElements(arr, 11, size);
//        size = addElements(arr, 26, size);
//        size = addElements(arr, 30, size);
//        System.out.println("Mảng: "+ Arrays.toString(arr));
//        System.out.println("Mảng có size là: "+size);
//        System.out.println("Vị trí của phần từ 11 là: "+ searchElement(arr,11,size));
//
//        int sizeLater = delete(arr,11,size);
//        System.out.println("Mảng lúc đầu: "+ Arrays.toString(arr));
//        System.out.println("Size mảng lúc sau: "+ sizeLater);
        Scanner input = new Scanner(System.in);
        int choice;
        int[] arr = new int[5];
        int size = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1.Add elements");
            System.out.println("2.Search element");
            System.out.println("3.Delete element");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add elements (Mảng tối đa có 5 phần tử)");
                    for (int i = 0; i < 5; i++) {
                        int addElement = input.nextInt();
                        size = addElements(arr, addElement, size);
                    }
                    System.out.println("Mảng: " + Arrays.toString(arr));
                    System.out.println("Size của mảng là: " + size);
                    break;
                case 2:
                    System.out.println("Mảng: " + Arrays.toString(arr));
                    System.out.println("Nhập phần tử muốn tìm:");
                    int elementSearch = input.nextInt();
                    int locationElement = searchElement(arr, elementSearch, size);
                    System.out.println("Vị trí của phần tử mà bạn đã nhập: " + locationElement);
                    break;
                case 3:
                    System.out.println("Nhập số mà bạn muốn xóa:");
                    int elementDelete = input.nextInt();
                    System.out.println("Mảng lúc đầu :"+Arrays.toString(arr));
                    System.out.println("Size của mảng lúc đầu :" + size);
                    int newSize = delete(arr,elementDelete, size);
                    System.out.println("Mảng lúc sau :" + Arrays.toString(arr));
                    System.out.println("Size của mảng lúc sau :" +newSize);
                    break;
            }

        } while (choice != 0);
    }

    public static int addElements(int[] arr, int element, int size) {
        arr[size] = element;
        size++;
        return size;
    }

    public static int delete(int[] arr, int element, int size) {
        int index = searchElement(arr, element, size);
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        size--;
        return size;
    }

    public static int searchElement(int[] arr, int element, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
