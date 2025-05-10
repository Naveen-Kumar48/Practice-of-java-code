import java.util.*;
public class demo2{
public static void main(String[] ar){
	int n;
	int fact=1;
	System.out.println(" enter the number");
	Scanner ob=new Scanner(System.in);
	n=ob.nextInt();
	 for(int i=1;i<=n;i++){
fact=fact*i;
	 }
	 System.out.println("the factorial is= "+fact);
	 }
	
}