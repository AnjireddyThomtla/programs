package com.mondee;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vendor")
public class Vendor {
	@Id
	@Column(name="vid")
private int id;
	
	@Column(name="vname")
private String name;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Customers.class,cascade=CascadeType.ALL)
	@JoinColumn(name="fkvid",referencedColumnName="vid")
	private Set obj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getObj() {
		return obj;
	}

	public void setObj(Set obj) {
		this.obj = obj;
	}
	
}
