import java.util.*;

public class DoggieBag
{
	public ArrayList<Dog> sack;
	
	public DoggieBag()
	{
		sack = new ArrayList<Dog>();
	}
	
	public ArrayList<Dog> getSack()
	{
		return sack;
	}
	
	public void add(Dog d)
	{
		sack.add(d);
	}
}
