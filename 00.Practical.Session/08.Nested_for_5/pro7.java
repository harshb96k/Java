/*write a program to print the following pattern
Row =5;
O
14 13
L K J
9 8 7 6
E D C B A

Row = 4
10
I H
7 6 5
D C B A
*/
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of rows");
		int row=Integer.parseInt(br.readLine());
		int n=row*(row+1)/2;
		char ch='A';
		for(int i=1;i<n;i++){
			ch++;
		}
		for(int i=row; i>=1; i--){
			if(i%2==1){
				for(int j=1; j<=row-i+1; j++){
					System.out.print(ch+" ");
					ch--;
					n--;
				}}
			if(i%2==0){
					for(int k=1; k<=row-i+1;k++){
						System.out.print(n+" ");
						ch--;
						n--;
					}
				}System.out.println();
			}

	}}
