/*
WAP to find the common elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Common elements :
1
2
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
				System.out.println("Enter elements of second array");
				int arr1[]=new int[size];
				 for(int i=0; i<arr1.length;i++){
                                        arr1[i]=Integer.parseInt(br.readLine());
                                }
				System.out.println("Common elements are:");
				for(int i=0;i<arr.length;i++){
					for(int j=0;j<arr.length;j++){
						if(arr[i]==arr1[j]){
							System.out.println(arr[i]);
						}
					}
				}
	}
}
