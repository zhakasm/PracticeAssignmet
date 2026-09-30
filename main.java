public class main {

        public static int binarySearchIterative(int[] a, int target) {
            int low = 0;
            int high = a.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (a[mid] == target) {
                    return mid;
                } else if (target < a[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return -1;
        }

        public static void main(String[] args) {

            int[] array = {1, 3, 5, 7, 9, 11, 13};

            // Example 1
            int result1 = binarySearchIterative(array, 7);
            System.out.println("Target 7: index = " + result1);

            // Example 2
            int result2 = binarySearchIterative(array, 11);
            System.out.println("Target 11: index = " + result2);

            // Example 3
            int result3 = binarySearchIterative(array, 6);
            System.out.println("Target 6: index = " + result3);
        }
    }

