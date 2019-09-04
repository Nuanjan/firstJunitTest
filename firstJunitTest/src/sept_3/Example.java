package sept_3;

import java.util.Arrays;
import java.util.Random;

public class Example {

	public static void main(String[] args){

		int[] randomArray = createRandomArray(10);
		
		System.out.println("The Array");
		System.out.println(Arrays.toString(randomArray));

		System.out.println("\n\nO(1)");
		System.out.println(O_of_1(randomArray));
		System.out.println("_____________________________");

		System.out.println("\n\nO(n)");
		System.out.println(O_of_n(randomArray));
		System.out.println("_____________________________");

		System.out.println("\n\nO(?)");
		O_of_what1(randomArray);
		System.out.println("_____________________________");

		System.out.print("\n\nO(?)");
		O_of_what2(randomArray);
		System.out.println("_____________________________");

		System.out.println("\n\nO(log(n))");
		System.out.println(O_of_log_n(randomArray));
		System.out.println("_____________________________");

		System.out.println("\n\nO(n^n)");
		System.out.println(O_of_n_squared(randomArray));
		System.out.println("_____________________________");
		
		System.out.println("\n\nO(?)");
		System.out.println(O_of_what3(randomArray));
		System.out.println("_____________________________");
		
		System.out.print("\n\nO(k^n)");
		O_of_k_to_n(randomArray);
		System.out.println("_____________________________");


	}

	public static int[] createRandomArray(int size) {
		int[] toRet = new int[size];

		Random random = new Random();

		for(int i = 0; i < size; i++) {
			int randomInteger = random.nextInt(100);

			toRet[i] = randomInteger;
		}

		return toRet;
	}

	/**
	 * An example of O(1). It only takes one step for completion
	 * 
	 * @return
	 */
	public static int O_of_1(int[] items) {
		return items[0];
	}


	/**
	 * An example of O(n). A linear time algorithm
	 * 
	 * It looks through the entire array to find the sum of all the integers in the array 
	 * 
	 * @return
	 */
	public static int O_of_n(int[] items) {

		int sum = 0;

		for(int i = 0; i < items.length; i ++) {
			sum += items[i];
		}

		return sum;
	}

	/**
	 * 
	 * What is computational complexity of this function?
	 * 
	 * @param items
	 */
	public static void O_of_what1(int[] items) {
		int middleIndex = items.length / 2;
		int index = 0;

		while (index < middleIndex) {
			System.out.println(items[index]);
			index++;
		}

		index = 0;

		while (index < items.length) {
			System.out.println(items[index]);
			index++;
		}
	}

	/**
	 * 
	 * What is computational complexity of this function?
	 * 
	 * @param items
	 */
	public static void O_of_what2(int[] items) {

		int middleIndex = items.length / 2;
		int index = 0;

		while (index < middleIndex) {
			System.out.println(items[index]);
			index++;
		}

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}


	/**
	 * An example of O(log n). A Logarithmic Time Algorithm O(log n)
	 * 
	 * Sums values at the indices two magnitudes away. 
	 * 
	 * @param items
	 */
	public static int O_of_log_n(int[] items) {

		int sum = 0;

		for(int i = 1; i < items.length; i = i * 2) {
			sum += items[i-1];
			
			System.out.println(i);
		}

		return sum;
	}


	/**
	 * 
	 * What is computational complexity of this function?
	 * 
	 * @param items
	 */
	public static int O_of_what3(int[] items) {
		
		int sum = 0;
		
		for (int i = 1; i <= items.length; i++){
			for(int j = 1; j < items.length; j = j * 2) {
				sum += items[i-1] + items[j-1];
			}
		}
		
		return sum;
	}

	/**
	 * An example of O(n^2). A Polynomial Time Algorithm O(n^p)
	 * 
	 * 
	 * This attempts to find the maximum sum of any 2 values in the given array.   
	 * 
	 * @return
	 */
	public static int O_of_n_squared(int[] items) {

		int v1 = 0, v2 = 0, max = Integer.MIN_VALUE, temp;

		for(int i = 0; i < items.length; i ++) {
			v1 = items[i];

			for(int j = 0; j < items.length; j ++) {

				v2 = items[j];

				if(j == i) continue;

				temp = v1 + v2;

				max = Math.max(temp, max);
			}

		}

		return max;
	}
	
	public static int inclassAssignment(int[] items) {

		/*
		 * Example of 0(n) to find maximum value of two numbers in array and return sum of two values
		 */
int v1=0, v2=0,sumMax;
for (int i=0;i<items.length;i++) {
	if (items[i]>v1) {
		v1=items[i];
	}
	
	if(items[i]>v2 && v2!=v1) {
		v2=items[i];
	}
}

sumMax=v1+v2;
		return sumMax;
	}

	/**
	 * An example of O(2^n). An Exponential Time Algorithms O(k^n)
	 * 
	 * O(k^n) algorithms will get k times bigger with every additional input
	 * 
	 * @param k
	 * @param items
	 */
	public static void O_of_k_to_n(int[] items) {

		for (int i = 1; i <= Math.pow(2, items.length); i++){
			System.out.println("Hey - I'm busy looking at: " + i);
		}

	}


}


