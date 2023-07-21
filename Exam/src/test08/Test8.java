package test08;

import java.util.HashMap;
import java.util.Map;

class Person{
	private String pid;
	private String name;
	private int age;
	
	public String getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public Person(String pid,String name,int age) {
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pid + "," + name + "," +age;
	}
}
class PersonMap{
	private Map<String, Person> persons;
	
	public PersonMap() {
		persons = new HashMap<>();
		
	}
	public void addPerson(Person p) {
		persons.put(p.getPid(), p);
	}
	public boolean removePerson(String uid) {
		if(persons.containsKey(uid)) {
			persons.remove(uid);
			return true;
		}
	System.out.printf("Id '%s' no select.\n", uid);
	return false;
	}
	
	public void showAllPersons() {
		for(Person p : persons.values()) {
			System.out.println(p);
		}
	}
}
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonMap map = new PersonMap();
		
		Person p1 = new Person("a101","kimyousin",23);
		Person p2 = new Person("a102","kimchunchu",21);
		Person p3 = new Person("a103","jangbogo",31);
		Person p4 = new Person("a104","kanggamchan",42);
		Person p5 = new Person("a105","leesunsin",53);

		map.addPerson(p1);
		map.addPerson(p2);
		map.addPerson(p3);
		map.addPerson(p4);
		map.addPerson(p5);
		
		map.removePerson("kim");
		map.removePerson("a103");
		
		map.showAllPersons();
		
		
	}

}
