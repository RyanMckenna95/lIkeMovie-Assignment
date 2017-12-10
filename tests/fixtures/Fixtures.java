package fixtures;

import models.Movie;
import models.Rating;
import models.User;;

public class Fixtures {
	
	public static User[]users=
		{
			new User("Ryan", "Mckenna","22","m","Student","32323","i3232"),
			new User("Tom", "Sharp","25","m","Dentist","2toothhurty","54532")
		};
	
	public static Rating[]ratings=
		{
			new Rating(56,266,6),
			new Rating(2L,1L,7)
		};
	
	public static Movie[]movies=
		{
				new Movie("Saving private Ryan","1999","savingPrivateRyan.com"),
				new Movie("the Matrix","2001","www.matrix.com")
		};
}
