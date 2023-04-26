/*Q1
write a program to print the following pattern
D4 C3 B2 A1
A1 B2 C3 D4
D4 C3 B2 A1
A1 B2 C3 D4
*/
import java.io.*;
class demo{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of rows");
		int row=Integer.parseInt(br.readLine());
		for(int i=1; i<=row;i++){
			if(i%2==1){
				char ch='D';
				int x=4;
				for(int j=1; j<=row;j++){
					System.out.print(ch+""+ x + " ");
					ch--;
					x--;
				}System.out.println();
			}
			else{
				char ch='A';
				int x=1;
				for(int k=1; k<=row; k++){
					System.out.print(ch+""+ x + " ");
					ch++;
					x++;
				}
				System.out.println();
			}		
	}
}
		
}
