package task2;
// Task4: Find the second largest element in an array
public class task4 {

	 public static int findSecondLargest(int[] array) {
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] > largest) {
	                secondLargest = largest;
	                largest = array[i];
	            } else if (array[i] > secondLargest && array[i] != largest) {
	                secondLargest = array[i];
	            }
	        }

	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        int[] array = { 5, 10, 2, 8, 15, 3 };
	        int secondLargest = findSecondLargest(array);
	        System.out.println("The second largest element is: " + secondLargest);
	    }
}
