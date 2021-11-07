package com.pildoras.aop;

import com.pildoras.aop.aspectos.ConfigurationAOP;
import com.pildoras.aop.dao.ClientSingleDao;
import com.pildoras.aop.dao.ClientVipDao;
import com.pildoras.aop.dao.ClienteDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		//Read The configuration of spring
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ConfigurationAOP.class);

		//Get The bean bye conteiner of spring
		ClienteDao theClient = context.getBean("clienteDao", ClienteDao.class);
		ClientVipDao theClientVip = context.getBean("clientVipDao", ClientVipDao.class);
		ClientSingleDao theClientSingle = context.getBean("clientSingleDao", ClientSingleDao.class);

		//Call the method
		theClient.insertClient();
		System.out.println("***********************-----------------------************************");
		theClientVip.insertClient();
		System.out.println("***********************-----------------------************************");
		Client clientSingle = new Client();
		theClientSingle.insertClient(clientSingle, "single since params aspects");
		//close the contex
		context.close();
		SpringApplication.run(AopApplication.class, args);
	}

}
