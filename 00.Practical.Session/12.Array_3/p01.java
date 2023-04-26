//print count of digit in elements of array
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		int [] arr=new int[size];
		System.out.println("eneter array elements");
		for(int i=0; i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++){
			int count=0;
			while(arr[i]!=0){
				count++;
				arr[i]=arr[i]/10;
			}
			System.out.print(count+" ");
		}
	}
}




