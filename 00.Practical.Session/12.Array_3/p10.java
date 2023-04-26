//wap to print second min lement in an array
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
		 int min=arr[0];
		 for(int i=1;i<arr.length;i++){
			 if(arr[i]<min){
				 min=arr[i];
			 }
		 }
		 int smin=999;
		 for(int i=0;i<arr.length;i++){
			 if(smin>arr[i] && arr[i]>min){
				 smin=arr[i];
			 }
		 }
		 System.out.println("second min element is "+smin);
	}
}


