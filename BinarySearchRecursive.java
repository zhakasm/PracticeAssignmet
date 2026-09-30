public class BinarySearchRecursive {

        public static int binarySearchRecursive(int[] a, int target, int low, int high) {

            // Base case: target was not found
            if (low > high) {
                return -1;
            }

            int mid = low + (high - low) / 2;

            // Target found
            if (a[mid] == target) {
                return mid;
            }

            // Search in the left half
            if (target < a[mid]) {
                return binarySearchRecursive(a, target, low, mid - 1);
            }

            // Search in the right half
            return binarySearchRecursive(a, target, mid + 1, high);
        }

        public static void main(String[] args) {

            int[] array = {1, 3, 5, 7, 9, 11, 13};

            // Example 1
            int result1 = binarySearchRecursive(array, 7, 0, array.length - 1);
            System.out.println("Target 7: index = " + result1);

            // Example 2
            int result2 = binarySearchRecursive(array, 11, 0, array.length - 1);
            System.out.println("Target 11: index = " + result2);

            // Example 3
            int result3 = binarySearchRecursive(array, 6, 0, array.length - 1);
            System.out.println("Target 6: index = " + result3);
        }
    }

