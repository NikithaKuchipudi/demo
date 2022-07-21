class Dog implements Animal , TerrestrialAnimal , AquaticAnimal
{
	public void quality()
	{
		System.out.println("My quality is barking..");
	}
	public void livesIn()
	{
		System.out.println("I live on the land");
	}
	public static void main(String[] args)
	{
		Dog obj = new Dog();
		obj.quality();
		obj.livesIn();
	}
}