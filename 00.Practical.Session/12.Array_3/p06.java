//wap to find palindrome no from an array and return its index
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
			 int store=0;
			 int x=arr[i];
			 while(x!=0){
				 int rem=x%10;
				 store=(store*10)+rem;
				 x=x/10;
			 }
			 if(store==arr[i]){
				 System.out.println("Palindrome no "+arr[i]+" found at index "+i);
			 }
		 }
	}
}
