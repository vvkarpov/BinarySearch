package ru.vkarpov.dev;

public class Search {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        int num = 2;
        boolean result = BinarySearch(array, num);
        System.out.println(result);
    }

    public static boolean BinarySearch(int[] array, int num){
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (num == array[mid]){
                return true;
            }
            if (num < array[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }

}
