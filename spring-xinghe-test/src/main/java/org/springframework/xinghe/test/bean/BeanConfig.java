package org.springframework.xinghe.test.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/24 - 1:31 下午
 * @see [相关类/方法]
 * @since [版本号]
 */
@Configuration
public class BeanConfig {
	@Bean
	public Person person(){
		return new Person();
	}
}
