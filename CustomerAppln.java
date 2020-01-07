package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAppln {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("annotations/SpringAnnotations.xml");
		Customer cust=ctx.getBean("cust",Customer.class);
		System.out.println("code:"+cust.getCode());
		System.out.println("Name:"+cust.getName());
		
	}

}
