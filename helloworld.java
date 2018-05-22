public class helloworld {
	public static void main(String args[])
	{
		System.out.println("Hello WorldS!");
		System.out.println("My argumentses:");
		for (int i=0; i < args.length; i++)
		{
			System.out.println(" arg["+i+"] :"+args[i]);
		}
		System.out.println("Good bye!!");
	}
}
