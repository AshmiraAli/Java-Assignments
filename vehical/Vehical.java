public class Vehical
{
	private String make;
	private String model;
	private int year;
	
	public Vehical(String make,String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	//setter
	public void setMake(String make)
	{
		this.make=make;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	//getters
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return ("Vehical Details ; \nVehical's make : "+this.make+"\nModel : "+this.model+"\nYear : "+this.year);
	}
}