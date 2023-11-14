
 public class ArrayAnonymous {
	 
	public static void main(String[] args) {
		// anonymous int array 
		// new int[] { 1, 2, 3, 4};  

		// anonymous char array 
		// new char[] {'x', 'y', 'z'}; 

		// anonymous String array
		// new String[] {"Mohamed", "Samuel", "Kamara"}; 

		// anonymous multidimensional array
		// new int[][] { {10, 20}, {30, 40, 50} };

		sum(new int[] {1,2,3, 23,56,21});
	}
	public static void sum(int[] a) {
		int total = 0;
		//Using for-each loop
		for(int i : a)
			total = total + i;
		
		System.out.println("The sum is: " + total);
	}

}
