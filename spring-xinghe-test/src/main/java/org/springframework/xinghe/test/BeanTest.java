package org.springframework.xinghe.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.xinghe.test.bean.Person;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/24 - 11:35 上午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class BeanTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person.getName());
	}
}
