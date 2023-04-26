//print composite no within the range
//starting and ending npo is given by user
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter stating no");
		int sno=Integer.parseInt(br.readLine());
		System.out.println("enter ending no");
		int eno=Integer.parseInt(br.readLine());
		System.out.println(" composite number between"+sno+" and "+eno+" are ");
		for(int i=sno; i<=eno; i++){
			int count=0;
			for(int j=1; j<=i; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count>2){
				System.out.print(i+" ");
			}
		}
	}
}

