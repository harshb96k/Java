/*
 WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2
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
				System.out.println("Enter element to be searched");
                                int search=Integer.parseInt(br.readLine());
                                for(int i=0; i<arr.length;i++){
                                        if(arr[i]==search){
						System.out.println("Index of entered element is "+i);
                                	}
				}
	}
}
