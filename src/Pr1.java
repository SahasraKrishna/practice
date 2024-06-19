import java.util.Scanner;
public class Pr1 {
    Scanner sc=new Scanner(System.in);
	void NameEntry()
	{
		String name;
		System.out.println("enter the name:");
		name=sc.nextLine();
		if(name.length()>=50)
		{
			System.out.println("exceeds the required length");
		}
		
	}
}
