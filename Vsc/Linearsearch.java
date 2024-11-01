public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8};
        int target = 7;
        System.out.println( search(arr, target));
    }
    
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
