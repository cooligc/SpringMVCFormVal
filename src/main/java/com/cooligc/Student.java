/**
 * 
 */
package com.cooligc;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author sitakant
 *
 */
@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Size(min = 5, max = 10)
	private String name;

	@NotNull
	@Min(value=18)
	private int age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
