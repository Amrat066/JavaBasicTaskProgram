package Reflection;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	
	
	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void showdata() {
		System.out.println("the id is:="+id);
		System.out.println("the name is:="+name);
		System.out.println("the address is:="+address);
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
