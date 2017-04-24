
import java.util.*;

public class DogPile
{
	private Queue<Dog> dogPile;
	private int age1;
	private int age2;
	private String breed;
	private int gender;
	private String shelter;
	
	public DogPile()
	{
		dogPile = new LinkedList<Dog>();
		age1 = 0;
		age2 = 100;
		breed = "";
		gender = 2;
		shelter = "";
	}
	
	public Queue<Dog> createPile()
	{
		return dogPile;
	}
}