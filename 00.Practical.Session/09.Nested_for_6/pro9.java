//take range as iput and print strong no beteween the range
//strong no :-sum of factorial of all digit ina no is eual to that no
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter starting no");
		int sno=Integer.parseInt(br.readLine());
		System.out.println("enter ending no");
                int eno=Integer.parseInt(br.readLine());
		System.out.println("strong no between the given range");
		for(int i=sno; i<=eno; i++){
			int x=i;
			int rem;
			int sum=0;
			while(x!=0){
				rem=x%10;
				int mult=1;
				for(int j=1; j<=rem;j++){
					mult=mult*j;
				}
				sum=sum+mult;
				x=x/10;
			}if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
	}
}
					


