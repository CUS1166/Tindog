
import java.util.*;

public class User
{
	private DoggieBag db;
	
	public User()
	{
		db = new DoggieBag();
	}
	
	public void addDog(Dog d)
	{
		db.add(d);
	}
}
