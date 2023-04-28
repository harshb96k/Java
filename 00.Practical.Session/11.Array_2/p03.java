/*Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.
Input: 11 12 13 14 15
Output
Odd numbers sum = 39
Even numbers sum = 26
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
                                }
				int sum1=0;
				int sum2=0;
				for(int i=0; i<arr.length;i++){
					if(arr[i]%2==0){
						sum1=sum1+arr[i];
					}
					else{
						sum2=sum2+arr[i];
					}
				}
				System.out.println("Sum of even elements "+sum1);
				System.out.println("Sum of odd elements "+sum2);
	}
}














