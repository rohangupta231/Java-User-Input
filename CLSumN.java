class CLSumN
{	
	public static void main(String dt[])
	{
		int sum=0;
		for(int i=0;i<dt.length;i++)
		{
			sum=sum+Integer.parseInt(dt[i]);
		}
		System.out.println(sum);
	}
}