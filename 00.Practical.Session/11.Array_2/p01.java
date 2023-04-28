/*Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and find the sum of all elements in the array.
*/
import java.io.*;
class demo{
	public static void main(String []args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter size of array");
				int size=Integer.parseInt(br.readLine());
				int arr[]=new int[size];
				System.out.println("enter array elements");
				int sum=0;
				for(int i=0; i<arr.length;i++){
					arr[i]=Integer.parseInt(br.readLine());
					sum=sum+arr[i];
				}System.out.println("Sum of array elements is "+sum);
	}
}

