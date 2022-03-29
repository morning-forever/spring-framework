package gcy;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanFactoryTest {

	public static void main(String args[]){
		DefaultListableBeanFactory dbf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(dbf);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("gcy/gcy-spring.xml"));
		MyTestBean myTestBean = (MyTestBean) dbf.getBean("myTestBean");

		System.out.println(myTestBean.getTestStr());
	}
}
