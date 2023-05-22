package circle;

	import java.util.Scanner;

	public class Q3 {

		public static void main(String[] args) {
			int i [][];
			i = new int [5][5];
			i[0][0] = 1;

			int row = 0;
			int col = 0;
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			while((a==1)||(a==-1)||(a==2)||(a==-2)) {
				if((row<0)||(row>4))
					row=0;
					i[row][col]=1;
					
				if((col<0)||(col>4))
					col=0;
					i[row][col]=1;
				if((a==1)||(a==-1)) {
					i[0][0]=0;
					i[row][col]=0;
					row+=a;
					i[row][col]=1;
				}
				else if((a==2)||(a==-2)){
					i[0][0]=0;
					i[row][col]=0;
					col+=++a;
					i[row][col]=1;
				if(a==0) {
					break;
				}
				}
				
				int m = i.length;
				int n = i[0].length;
				for(int t = 0; t < m; t++) {
					for (int h = 0; h < n; h++) {
						System.out.print(i[h][t]);
					}
					System.out.println();
				}
				
				a = scan.nextInt();
			}
		scan.close();
		}
	}

