package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Employee s=(Employee) ctx.getBean("emp");
		Employee s1=(Employee) ctx.getBean("emp");
		s.setName("Rachana");
		s.setSal(1234);
		System.out.println(s.getName()+" "+s.getSal());
		s.setName("Pavani");
		s.setSal(4567);
		System.out.println(s1.getName()+" "+s1.getSal());
		System.out.println(s.getName()+" "+s.getSal());
		System.out.println(s.getSkills());
	}

}
