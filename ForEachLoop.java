
public class ForEachLoop {

	public static void main(String[] args) {
//		int nums[]= {12,3,4,2,56,7,5,4,3,9};
//		for(int n:nums) {
//			System.out.println(n + " ");
//		}
		int nums[][] = {
				{53,32,23,21,23,34,56,7,2,0,0},
				{12,23},
				{29,12,90}
				};
		for(int a[]: nums) {
			for(int b: a) {
				System.out.print(b +"  ");
			}
			System.out.println();
		}

	}

}
