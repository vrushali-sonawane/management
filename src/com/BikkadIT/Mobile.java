package com.BikkadIT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[]args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	Airtel air = context.getBean("airtel",Airtel.class);
	air.calling();
	air.browse();
	
	Vodafone voda = context.getBean("vodafone",Vodafone.class);
	voda.calling();
	voda.browse();
	
	Sim sim = context.getBean("sim",Airtel.class);
	sim.calling();
	sim.browse();
	
	Sim sim1 = context.getBean("sim1",Vodafone.class);
	sim1.calling();
	sim1.browse();
	
	
	
	
		
	}

}
