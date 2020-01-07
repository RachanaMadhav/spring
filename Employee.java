package beans;

import java.util.List;

public class Employee {
	private String name;
	private int sal;
	private List<String> skills;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void start(){
		System.out.println("this is start method");
			}
	public void stop(){
		System.out.println("this is stop");
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
}
