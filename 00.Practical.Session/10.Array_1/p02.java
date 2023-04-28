/*WAP to take size of array from user and also take integer elements from user Print
product of even elements only
input : Enter size : 9
Enter array elements : 1 2 3 2 5 10 55 77 99
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
		int mult=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				mult=mult*arr[i];
			}
		}
		System.out.println("product of even elements in an array is "+mult);
	}
}

