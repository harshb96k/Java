/*WAP to find the number of even and odd integers in a given array of integers
Input: 1 2 5 4 6 7 8
Output:
Number of Even Elements: 4
Number of Odd Elements : 3
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
				int num1=0;
				int num2=0;
				for(int i=0;i<arr.length;i++){
					if(arr[i]%2==0){
						num1++;
					}
					else{
						num2++;
					}
				}
				System.out.println("No of even elements in an array are "+num1);
				System.out.println("No of odd elemets in an array are "+num2);
	}
}
