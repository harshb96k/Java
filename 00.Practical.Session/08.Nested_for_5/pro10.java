/*write a program to print a series of prime numbers from entered range. ( Take a start and end number
from a user )
*/
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter starting no");
		int start=Integer.parseInt(br.readLine());
		System.out.println("enter ending no");
		int end=Integer.parseInt(br.readLine());
		for(int i=start; i<=end ;i++)
		{
			int count=0;
			for(int j=1; j<=i; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(i+" ");
			}
		}
	}
}

