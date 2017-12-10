package controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import controllers.LikeMovieAPI;
import models.Movie;
import models.User;


public class APITest {

	private LikeMovieAPI likeMovie=new LikeMovieAPI();
	
//Testing that the id's are being given correctly
	@Test
	public void testUser() {
		User u1 = new User("Ryan","Mckenna","22","M","Student","pass","i2222");
		assertEquals(0, likeMovie.getUsers().size());
		likeMovie.addUser("Ryan","Mckenna","22","M","Student","pass","i2222");
		assertEquals(1, likeMovie.getUsers().size());
		assertEquals(u1,likeMovie.getUser(2));
	}
	
	//delete function
	@Test
	public void testDeleteUser()
	{
		assertEquals(0, likeMovie.getUsers().size());
		likeMovie.addUser("Ryan", "Mckenna", "22", "M", "Student","pass","i2222");
		likeMovie.addUser("Bob", "The", "32", "M", "Builder","54321","32344s");
		assertEquals(2, likeMovie.getUsers().size());
		likeMovie.deleteUser(4);
		assertEquals(1,likeMovie.getUsers().size());
	}
	@Test
	public void testMovie()
	{
		Movie mov1 = new Movie("Super 8","2013","super8.com");
		assertEquals(0, likeMovie.getMovies().size());
		likeMovie.addMovie("Super 8", "2013", "super8.com");
		assertEquals(1, likeMovie.getMovies().size());
		assertEquals(mov1,likeMovie.getMovie(4));
	}
	@Test
	public void testDeleteMovie()
	{
		assertEquals(0, likeMovie.getMovies().size());
		likeMovie.addMovie("Super 8", "2013", "super8.com");
		likeMovie.addMovie("Cloverfield", "2009","cloverfield.com");
		assertEquals(2, likeMovie.getMovies().size());
		likeMovie.deleteMovie(2);
		assertEquals(1,likeMovie.getMovies().size());
	}
}