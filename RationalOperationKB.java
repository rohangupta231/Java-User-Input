import java.io.InputStreamReader;
import java.io.BufferedReader;
class Rational
{
	private int num,dem;
	public Rational()
	{
		num=0;
		dem=0;
	}
	/*public void input(int i,int j)
	{
		num=i;
		dem=j;
	}
	public void display()
	{
		System.out.print(num+"/"+dem+"\n");
	}*/
	public Rational add(Rational x, Rational y)
	{
		Rational sum=new Rational();
		sum.num=y.dem*x.num+y.num*x.dem;
		sum.dem=x.dem*y.dem;
		Simplify(sum);
		return sum;
	}
	public Rational sub(Rational x,Rational y)
	{
		Rational dif=new Rational();
		dif.num=y.dem*x.num-y.num*x.dem;
		dif.dem=x.dem*y.dem;
		Simplify(dif);
		return dif;
	}
	public Rational mul(Rational x,Rational y)
	{
		Rational pro=new Rational();
		pro.num=x.num*y.num;
		pro.dem=x.dem*y.dem;
		Simplify(pro);
		return pro;
	}
	public Rational	Simplify(Rational x)
	{
		int i;
		for(i=x.num*x.dem;i>1;i--)
		{
			if((x.num%i==0)&&(x.dem%i==0))
			{
				x.num=x.num/i;
				x.dem=x.dem/i;
			}
		}
		return x;
	}
	public String toString()
	{
		return (this.num+"/"+this.dem);
	}
	public static Rational parseRational(String str)
	{
		Rational r=new Rational();
		str=str.replace('/','q');
		String arr[]=str.split("q");
		r.num=Integer.parseInt(arr[0]);
		r.dem=Integer.parseInt(arr[1]);
		return r;
	}
}
class RationalOperationKB
{
	public static void main(String dt[])
	{
		InputStreamReader isr=null;
		BufferedReader br=null;
		try
		{
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			System.out.println("Enter First Rational Number");
			Rational r1=Rational.parseRational(br.readLine());
			System.out.println("Enter Second Rational Number");
			Rational r2=Rational.parseRational(br.readLine());
			Rational r3,r4,r5;
			//r1.input(2,4);
			//r2.input(2,4);
			r3=r2.add(r1,r2);
			r4=r2.sub(r1,r2);
			r5=r2.mul(r1,r2);
			//r1.display();
			//r2.display();
			//r3.display();
			//r4.display();
			//r5.display();
			//System.out.println(r1);
			//System.out.println(r2);
			System.out.println("Addition ="+r3);
			System.out.println("Subtraction ="+r4);
			System.out.println("Multiplication ="+r5);
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