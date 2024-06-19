import java.util.Scanner;

public class RightAngle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		do
		{
		System.out.println("enter the name:");
		name=sc.nextLine();
		System.out.println("Length :"+name.length());
		if(name.length()>=50)
		{
			System.out.print("excceeds the required length");
			System.out.println("re-enter the name:");
		}
		}
		while(name.length()>50);
		sc.close();	
	}
}