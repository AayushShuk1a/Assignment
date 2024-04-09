public class Main {
    public static int findIndex(ArrayList<Integer> arr) {
        int low = 0;
        int high = 1; 

        
        while (arr[high] != -1) {
            low = high;
            high *= 2;
        }
   
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == -1 && arr[mid - 1] != -1) {
                return mid;
            } else if (arr[mid] == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }


        return -1; 
    }
}
