/*WAP to take size of array from user and also take integer elements from user Print sum
of odd elements only
input : Enter size : 5
Enter array elements : 1 2 3 4 5
*/
import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of array");
		int size=Integer.parseInt(br.readLine());
		int [] arr=new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2==1)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of odd elements in an array is "+sum);
	}
}


