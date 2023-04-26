//wap to find armstrong no from an array and return its index
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
		 for(int i=0; i<arr.length;i++){
			 int x=arr[i];
			 int count=0;
			 int sum=0;
			 while(x!=0){
				 count++;
				 x=x/10;
			 }
			 int y=arr[i];
			 while(y!=0){
				 int rem=y%10;
				 int z=count;
				 int mult=1;
				 while(z!=0){
					 mult=mult*rem;
					 z--;
				 }
				 sum=sum+mult;
				 y=y/10;
			 }
			 if(sum==arr[i]){
				 System.out.println("Armstrong no "+arr[i]+" is found at index "+i);
			 }
		 }
	}
}





