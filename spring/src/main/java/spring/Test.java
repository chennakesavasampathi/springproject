package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	
	ApplicationContext context=new ClassPathXmlApplicationContext("/spring/pom.xml");
	
	
	Student st=context.getBean("student" ,Student.class);
	System.out.println(st.str);
	System.out.println(st.no);
}
}
