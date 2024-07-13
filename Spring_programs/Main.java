package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Resource resource=new ClassPathResource("test/configure.xml");
		 BeanFactory beanFactory=new XmlBeanFactory(resource);
		 PET pet=(PET)beanFactory.getBean("pt-1");
		 System.out.println("Pet Name:"+pet.getName());
		 System.out.println("Pet Price:"+pet.getPrice());
	}

}
