
public class Employee {
	private String name;
	private int age;
	private Address address;
	private Location location;
	private  boolean status;
public boolean isStatus() {
		return status;
	}

	public Employee(String name, int age, Address address, Location location, boolean status) {
	super();
	this.name = name;
	this.age = age;
	this.address = address;
	this.location = location;
	this.status = status;
}

	public void setStatus(boolean status) {
		this.status = status;
	}
public static String district="thanjavur";

	public Employee() {
		super();
	}

	 void test() {
		System.out.println(age);
	}
	public Employee(String name, int age, Address address, Location location) {
		super();
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.location= location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", location=" + location + "]";
	}

}
