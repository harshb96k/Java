/*input:
       enter upper limit:1
       enter lowe limit:50
output:
	10,20,30,40,50
	count=5*/
import java.io.*;
class demo{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter lower limit");
				int ll=Integer.parseInt(br.readLine());
				System.out.println("enter upper limit");
				int ul=Integer.parseInt(br.readLine());
				System.out.println("following are the no divisible by 5 and also even:-");
				int count=0;
				for(int i=ll;i<=ul; i++){
					if(i%5==0 && i%2==0){
						System.out.println(i+" ");
						count++;
					}
				}
				System.out.println("Count="+count);
	}
}



