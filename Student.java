package beans;

public class Student {
	public Student(Address addr) {
		super();
		this.addr = addr;
	}
	
	public Student() {
		super();
	}
	
	public Student(String name, int regno) {
		super();
		this.name = name;
		this.regno = regno;
		
	}
	private String name;
	private int regno;
	private Address addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Address getAddr() {
		// TODO Auto-generated method stub
		return addr;
	}
	
}
