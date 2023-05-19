package circle2;
import java.util.Arrays;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		int i [];
		i = new int [10];
		i[0] = 1;
		System.out.println(Arrays.toString(i));
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if((a>=1)&&(a<=10)) {
			i[0] = 0;
			i[--a] = 1;
			System.out.println(Arrays.toString(i));
		}
		scan.close();	
	}

}
