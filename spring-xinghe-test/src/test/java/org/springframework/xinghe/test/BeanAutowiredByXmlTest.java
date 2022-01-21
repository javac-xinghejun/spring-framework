package org.springframework.xinghe.test;

import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.xinghe.test.bean.Person;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2022/1/21 - 9:59 上午
 * @see [相关类/方法]
 * @since [版本号]
 */
@TestInstance(Lifecycle.PER_CLASS)
public class BeanAutowiredByXmlTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = applicationContext.getBean("person", Person.class);
		System.out.println("person: " + JSONUtil.toJsonStr(person));
	}
}
