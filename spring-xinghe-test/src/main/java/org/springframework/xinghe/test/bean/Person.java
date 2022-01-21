package org.springframework.xinghe.test.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/24 - 11:34 上午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class Person {
	private Long id;
	private String name;
	private List<Integer> pets;
	private Map<String,Integer> gradeMap;
	private Properties properties;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getPets() {
		return pets;
	}

	public void setPets(List<Integer> pets) {
		this.pets = pets;
	}

	public Map<String, Integer> getGradeMap() {
		return gradeMap;
	}

	public void setGradeMap(Map<String, Integer> gradeMap) {
		this.gradeMap = gradeMap;
	}


	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
