//wap to find perfect no from an array and return its index
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
		 for(int i=0; i<arr.length;i++){
			 int sum=0;
			 for(int j=1; j<arr[i];j++){
				 if(arr[i]%j==0){
					 sum=sum+j;
				 }
			 }
			 if(sum==arr[i]){
				 System.out.println("perfect no"+arr[i]+" is found at index "+i+" ");
			 }
		 }
	}
}
