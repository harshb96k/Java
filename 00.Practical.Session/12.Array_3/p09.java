//wap to print second max element in an array
import java.io.*;
class demo{
        public static void main(String[] args)throws IOException{
                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter size of array");
                int size=Integer.parseInt(br.readLine());
                int [] arr=new int[size];
                System.out.println("enter array elements");
                 for(int i=0; i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());

                 }
		 int max=arr[0];
		 for(int i=1;i<arr.length;i++){
			 if(arr[i]>max){
				 max=arr[i];
			 }
		 }
		 int smax=0;
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]>smax && arr[i]<max){
				 smax=arr[i];
			 }
		 }
		 System.out.println("second max element in an array is "+smax);
	}
}	

