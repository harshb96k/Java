//take range as input and print perfect numbers beteween the range
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter strarting no");
		int sno=Integer.parseInt(br.readLine());
		System.out.println("Enter ending no");
                int eno=Integer.parseInt(br.readLine());
		for(int i=sno; i<=eno; i++){
			int sum=0;
			for(int j=1;j<i; j++){
				if(i%j==0){
					sum=sum+j;
				}
			}
			if(sum==i){
				System.out.print(i+" ");
			}
		}System.out.println();
	}
}
