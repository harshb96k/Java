/*write a program to print the following pattern
Row =4
0
1 1
2 3 5
8 13 21 34
*/
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of rows");
		int row=Integer.parseInt(br.readLine());
		int x=0;
		int y=1;
		int store=0;
		for(int i=0; i<+row; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(x+" ");
				store=x+y;
				x=y;
				y=store;
			}System.out.println();
		}
	}
}

