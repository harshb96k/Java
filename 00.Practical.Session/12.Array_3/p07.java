//wap to find a strong no in an array and return its index
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
			 int x=arr[i];
			 while(x!=0){
				 int rem=x%10;
				 int mult=1;
				 for(int j=1;j<=x;j++){
					 mult=mult*j;
				 }
				 sum=sum+mult;
				 x=x/10;
			 }
			 if(sum==arr[i]){
				 System.out.println("Palindrome no "+arr[i]+"is found at index "+i);
			 }
		 }
	}
}

