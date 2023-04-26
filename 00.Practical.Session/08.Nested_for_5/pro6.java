/*Write a program, and take two characters if these characters are equal then print them as it is but if
they are unequal then print their difference.
{Note: Consider Positional Difference Not ASCIIs}
*/
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter first character");
		char ch1=(char)br.read();
		System.out.println("enter second character");
		char ch2=(char)br.read();
		int diff=Integer.parseInt("ch2-ch1");//-Intger.parseInt("ch1");
		System.out.println(diff);
	}
}


