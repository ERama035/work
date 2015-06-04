package web_pr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tst1 {
public static void main(String[] args) {
	ApplicationContext  apct = new  ClassPathXmlApplicationContext("spring-config.xml");
	
	 beano sample = (beano) apct.getBean("beano");
	 
	 sample.printHello();
	
}
}
