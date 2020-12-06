package addressbookWithList;

import java.util.List;

import addressbookWithDAO.Person;

public interface PersonDAO {
	// Create
	void insert(Person person);
	
	//   Read
	List<Person> findAll();
	Person find(int id);
	Person find(String name);
	
	// Update
	void update(Person person,int id);
	void update(Person person,String name);
	
	//Delete
	void delete(Person person);
	void delete(int id);
	void delete(String name);

}
