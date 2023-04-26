/*write a program to print the following pattern
# = = = =
= # = = =
= = # = =
= = = # =
= = = = #
*/
import java.io.*;
class demo{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of rows");
		int row=Integer.parseInt(br.readLine());
		for(int i=1; i<=row;i++){

			for(int j=1; j<=row; j++){
				if(i==j){
					System.out.print("#"+" ");
				}
				else{
					System.out.print("="+" ");
				}
			}System.out.println();
		}
	}
}
