package addressbookWithList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonList implements PersonDAO, Iterable<Person> {
	
	private List<Person> pList = null;
	
	public PersonList() {
		this.pList = new ArrayList<Person>();
	}
	
	public PersonList(List<Person> list) {
		setList(list);
	}
	
	public void setList(List<Person> list) {
		this.pList = list;
	}



	@Override
	public void insert(addressbookWithDAO.Person person) {
		
	}

	@Override
	public List<addressbookWithDAO.Person> findAll() {
		return null;
	}

	@Override
	public addressbookWithDAO.Person find(int id) {
		return null;
	}

	@Override
	public addressbookWithDAO.Person find(String name) {
		return null;
	}

	@Override
	public void update(addressbookWithDAO.Person person, int id) {
	}

	@Override
	public void update(addressbookWithDAO.Person person, String name) {
	}

	@Override
	public void delete(addressbookWithDAO.Person person) {
	}

	@Override
	public void delete(int id) {
	}

	@Override
	public void delete(String name) {
	}
	
	@Override
	public Iterator<Person> iterator() {
		return null;
	}
}
