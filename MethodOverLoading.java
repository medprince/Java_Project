
public class MethodOverLoading {
	int add(int a, int b , int c){
		int result1 = a * b *c;
		return result1;
	}
	int add(int a, int b){
		int result2 = a * b;
		return result2;
	}
	int add(int a, int b , int c, int d){
		int result3 = a * b *c *d;
		return result3;
	}

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		int result1 = obj.add(12, 3);
		System.out.println("Resul1 with 2 parameter: " + result1);
		int result2 = obj.add(12, 3, 32);
		System.out.println("Resul2 with 3 parameter: " +result2);
		int result3 = obj.add(12, 3,13,24);
		System.out.println("Resul3 with 4 parameter: " +result3);
		

	}

}
