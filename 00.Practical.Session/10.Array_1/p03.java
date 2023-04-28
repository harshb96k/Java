/*WAP to take size of array from user and also take integer elements from user Print
product of odd index only
input : Enter size : 6
Enter array elements : 1 2 3 4 5 6*/
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
                        if(i%2==1){
                                mult=mult*arr[i];
                        }
                }
                System.out.println("product of odd index elements elements in an array is "+mult);
        }
}
