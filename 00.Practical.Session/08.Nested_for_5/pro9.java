/*Write a program to take a number as input and print the Addition of Factorials of each
digit from that number.
Input: 1234
Output: Addition of factorials of each digit from 1234 = 33
*/
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter the no-:");
		int num=Integer.parseInt(br.readLine());
		int add=0;
		int store=num;
		while(num!=0){
			int mult=1;
			int x=num%10;
			for(int i=1; i<=x; i++){
				mult=mult*i;
			}
			add=add+mult;
			num=num/10;
		}
		System.out.println("addition of factorial of digits in "+store+" is:"+add);

	}
}
