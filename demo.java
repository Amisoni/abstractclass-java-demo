abstract class abc
{
	abstract void sum(int x,int y);
	void p(int x)
	{
		System.out.println("Value="+x);
	}
}

class pqr extends abc
{
	void sum(int x,int y)
	{
		System.out.println("Sum Is="+(x+y));
	}	
}

class xyz extends abc
{
	void sum(int x,int y)
	{
		System.out.println("Mul Is="+(x*y));
	}
}

class demo
{
	public static void main(String args[])
	{
		abc a=new xyz();
		a.sum(10,2);
		a.p(10);
	}
}

