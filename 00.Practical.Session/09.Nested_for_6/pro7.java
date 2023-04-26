//take range as input and print palindrome no between the range
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter starting no");
		int sno=Integer.parseInt(br.readLine());
		System.out.println("enter ending no");
                int eno=Integer.parseInt(br.readLine());
		System.out.println("palindrome no between the given range are");
		for(int i=sno; i<=eno; i++){
			int x=i;
			int rem;
			int store=0;
			while(x!=0){
				rem=x%10;
				store=(store*10)+rem;
				x=x/10;
			}
			if(store==i){
				System.out.print(i+" ");
			}
		}System.out.println();
	}
}
				
