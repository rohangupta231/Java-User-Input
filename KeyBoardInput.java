import java.io.InputStreamReader;
import java.io.BufferedReader;
class KeyBoardInput
{
	public static void main(String dt[])
	{
		int a,b,sum;
		try
		{
			InputStreamReader isr=null;
			BufferedReader br=null;
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			System.out.println("Enter First Number");
			a=Integer.parseInt(br.readLine());
			System.out.println("Enter Second Number");
			b=Integer.parseInt(br.readLine());
			sum=a+b;
			System.out.println("Sum ="+sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				br.close();
				isr.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}