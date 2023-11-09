
public class TwoDArray {

	public static void main(String[] args) {
		int nums1[][] = new int[3][2];
		nums1[0] = new int[4];
		nums1[1] = new int[2];
		nums1[2] = new int[3];
		nums1[0][0] = 3;
		nums1[0][1] = 2;
		nums1[1][0]= 12;
		nums1[1][1] = 3;
		nums1[2][0] = 2;
		nums1[2][1]= 12;
		
		int nums[][] = {
						{53,32,23,21},
						{12,23},
						{29,12,90}
						};
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("  ");
		for(int i=0; i<nums1.length; i++) {
			for(int j=0; j<nums1[i].length; j++) {
				System.out.print(nums1[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
