package org.jboss.test.isolation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author Emmanuel Bernard
 */
@Entity
public class User {
	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	@Id @GeneratedValue
	public Long getId() { return id; }
	public void setId(Long id) {  this.id = id; }
	private Long id;

	@NotNull
	public String getName() { return name; }
	public void setName(String name) {  this.name = name; }
	private String name;
}
