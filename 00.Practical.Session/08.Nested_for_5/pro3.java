/* 5 4 3 2 1
 * 8 6 4 2
 * 9 6 3 
 * 5
 * */
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of rows");
		int row=Integer.parseInt(br.readLine());
		for(int i=1; i<=row; i++){
			int x=i*(row-i+1);
			for(int j=1;j<=row-i+1; j++){
				System.out.print(x+" ");
				x=x-i;
			}
			System.out.println();
		}
	}
}

