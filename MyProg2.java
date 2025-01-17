import java.lang.*;
class MyScope{
	public static void main(String[] args) {
		int i = 10;
		int j = 50;
		System.out.println("i=" + i + "j=" +j);
		{
			int k = 30;
			System.out.println("i=" + i);
			System.out.println("j=" + j);
			System.out.println("k=" + k);
		}
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
	}
}
