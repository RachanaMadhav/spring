package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Student s=(Student) ctx.getBean("std");
		/*s.setName("Deloitte");
		s.setRegno(123);*/
		System.out.println(s.getName()+" "+s.getRegno()+" "+s.getAddr().getCity()+" "+s.getAddr().getStreet());

}
}