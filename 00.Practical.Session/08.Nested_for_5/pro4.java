/*WAP to print all even numbers in reverse order and odd numbers in the standard way. Both separately.
Within a range. Take the start and end from user
*/
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter start no");
		int start=Integer.parseInt(br.readLine());
		System.out.println("enter end no");
		int end=Integer.parseInt(br.readLine());
		for(int i=end; i>=start;i--){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}System.out.println();
		for(int i=start; i<=end;i++){
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
	}
}

