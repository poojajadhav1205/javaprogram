package Interface;

class Square implements Printable
{
	public void print()
	{ 
		int a=10;
		int s;
		s=a*a;
		System.out.println("Square is:"+s);
	}
}
class Cube implements Calculate 
{
	public void cal()
	{
		int b=2;
		int c=b*b*b;
		System.out.println("Cube is :"+c);
	}
	}
class CubeSquare
{
	public static void main(String args[])
	{
		Square s=new Square();
		Cube c=new Cube();
		c.cal();
		s.print();
	}
	}

