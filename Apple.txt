class Apple extends Fruit
{
	void colour()
	{
		System.out.println("I am in red colour.....");
	}
	public static void main(String [] args)
	{
		Apple obj = new Apple();
		obj.colour();
		obj.taste();
	}
}