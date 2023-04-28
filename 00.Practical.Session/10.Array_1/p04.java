/*Write a program, take 7 characters as an input , Print only vowels from the array
Input: a b c o d p e
Output : a o e
*/
import java.io.*;
class demo{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter size of array");
                int size=Integer.parseInt(br.readLine());
                char [] arr=new char[size];
                System.out.println("Enter array elements");
                for(int i=0; i<arr.length; i++){
                        arr[i]=(char)br.read();
			br.skip(1);
                }
		for(int i=0; i<arr.length;i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='0' || arr[i]=='u'){
				System.out.print(arr[i]+" ");
			}
		}System.out.println();
	}
}
