
public class Ch5_p47 
{
	public static void main(String[] args) 
	{
		Car car1 = new Car("1����");
		car1.start();
		
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("���b�i��main()���B�z�u�@");
			}
			catch(InterruptedException e)
			{

			}
		}
	}
}
class Car extends Thread
{
private String name;

	
	public Car(String nm)
	{
		name=nm;
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}