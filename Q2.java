package circle2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int i [];
		i = new int [10];
		i[0] = 1;
		System.out.println(Arrays.toString(i));
		
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		while((a==1)||(a==-1)) {
			i[0]=0;
			i[sum]=0;
			sum+=a;
			i[sum]= 1;
			System.out.println(Arrays.toString(i));
			a = scan.nextInt();
		}
		scan.close();
	}

}
