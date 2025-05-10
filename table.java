import java.util.*;
public class table{
	
	public static void main(String [] args){
	int n;
	int s;
	System.out.println("Enter the table no.");
	Scanner ob=new Scanner(System.in);
	n=ob.nextInt();
for(int i=1;i<=10;i++){
      s=i*n;
System.out.println(n + " x " + i + " = " + s);
	}
	
}
}