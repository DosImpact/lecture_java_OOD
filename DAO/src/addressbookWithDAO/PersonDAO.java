package addressbookWithDAO;

import java.util.List;

public interface PersonDAO {
	void insert(Person person);
	List<Person> findAll();
	Person find(int id);
	Person find(String name);
	void update(Person person,int id);
	void update(Person person,String name);
	
	void delete(Person person);
	void delete(int id);
	void delete(String name);

}
