
package circle;
import java.util.Scanner;
public class test3 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int b = 0;
		for(int i=2; i<s; i++) {
			int count = 0;
			
			for(int j=2; j<=i; j++) {
			if(i%j==0) {
				count++;
				}
			}
			if(count==1) {
				b++;
			}
		}
		System.out.println("소수의 개수는" + b + "입니다.");
		
		
		scanner.close();
	}
	
}
