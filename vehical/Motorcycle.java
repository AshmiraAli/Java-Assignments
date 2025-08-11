public class Motorcycle extends Vehical
{
	private String colour;
	
	public Motorcycle(String make,String model,int year,String colour)
	{
		super(make,model,year);
		this.colour=colour;
	}
	@Override
	public String toString()
	{
		return (super.toString()+"\nColour : "+this.colour);
	}
}