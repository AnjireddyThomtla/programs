package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colleageid")
public class ColleageId {

	private int cid;
	
	@Column(name="cname")
	private String name;
	
	@Id
	@GeneratedValue
	@Column(name="cId_PK")
	public int getcid() {
		return cid;
	}

	public void setcid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
