class PrintData
{
	void show(int n)
	{
	System.out.print(n);
	}
	void show(float n)
	{
	System.out.print(n);
	}
	void show(char c)
	{
	System.out.print(c);
	}
	public static void main(String[]args)
	{
	PrintData ob=new PrintData();
	ob.show('A');
	ob.show(10);
	ob.show(0.5f);
	}
}	