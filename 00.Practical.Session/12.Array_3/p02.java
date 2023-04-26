//wap to reverse each element in array
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
		for(int i=0; i<arr.length; i++){
			int store=0;
			while(arr[i]!=0){
				int rem=arr[i]%10;
				store=(store*10)+rem;
				arr[i]=arr[i]/10;
			}
			System.out.print(store+" ");
		}
	}
}
