//take no as iput and print no of digits in it
import java.io.*;
class demo{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the no");
		int no=Integer.parseInt(br.readLine());
		int count=0;
		while(no!=0){
			count++;
			no=no/10;}
		System.out.println("count of digit is-"+ count);
	}
}


