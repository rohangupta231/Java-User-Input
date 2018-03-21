import java.io.InputStreamReader;
import java.io.BufferedReader;
class Complex
{
	private int r,im;
	private Complex()
	{
		r=0;
		im=0;
	}
	public Complex(int i, int j)
	{
		r=i;
		im=j;
	}
	/*public void input(int i,int j)
	{
		r=i;
		im=j;
	}
	public void display()
	{
		System.out.print(r+"+i"+im+"\n");
	}*/
	public String toString()
	{
		return (this.r+"+i"+this.im);
	}
	public Complex add(Complex x,Complex y)
	{
		Complex sum= new Complex();
		sum.r=x.r+y.r;
		sum.im=x.im+y.im;
		return sum;
	}
	public static Complex parseComplex(String str)
	{
		Complex c=new Complex();
		str=str.replace('+','i');
		String temp[]=str.split("ii");
		c.r=Integer.parseInt(temp[0]);
		c.im=Integer.parseInt(temp[1]);
		return c;
	}
}
class ComplexKB
{
	public static void main(String dt[])
	{
		InputStreamReader isr=null;
		BufferedReader br=null;
		try
		{
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			System.out.println("Enter First Complex Number");
			Complex c1=	Complex.parseComplex(br.readLine());
			System.out.println("Enter Second Complex Number");
			Complex c2= Complex.parseComplex(br.readLine());
			Complex c3;
			//c1.input(2,3);
			//c2.input(3,3);
			c3=c2.add(c1,c2);
			//c1.display();
			//c2.display();
			//c3.display();
			//System.out.println(c1);
			//System.out.println(c2);
			System.out.println(c3);
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




























