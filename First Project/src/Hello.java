import java.lang.*;
public class Hello {

	public static int sum(int n, int m) {
		return n + m;
	}
	//main() ¸Þ¼Òµå
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10);
		a = '?';
		System.out.print(a);
		System.out.print('\n');
		System.out.print("Hello");
		System.out.print(s);
	}
}
