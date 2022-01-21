package org.springframework.xinghe.test.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Role;
import org.springframework.xinghe.test.bean.Person;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/24 - 1:31 下午
 * @see [相关类/方法]
 * @since [版本号]
 */
//@Configuration
//@Description("bean config class")
//@Role(BeanDefinition.ROLE_APPLICATION)
public class BeanConfig {

//	@Bean
//	@Description("person")
	public Person person() {
		return new Person();
	}
}
