package ru.vkarpov.dev;

public class Search {
    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int num = 3;
        boolean result = BinarySearch(array, num);
        System.out.println(result);
    }

    public static boolean BinarySearch(int[] array, int num){
        int low = 0;
        int high = array.length - 1;
        int mid = (int) Math.ceil(high / 2.0);

        while (true){
            if (num == array[mid]){
                return true;
            }
            else if (num < array[mid]){
                high = mid;
                mid = (int) Math.ceil(high / 2.0);
            }
            else if (num > array[mid]){
                low = mid;
                mid = (int) Math.ceil((high - low) / 2.0);
            }
            else
                return false;
        }
    }

}
