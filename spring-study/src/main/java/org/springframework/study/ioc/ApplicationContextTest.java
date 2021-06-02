package org.springframework.study.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.study.ioc.pojo.Person;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/6/2-下午6:04
 * @see [相关类/方法]
 * @since [版本号]
 */
public class ApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
	}
}
