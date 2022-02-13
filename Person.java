package com.mondee;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	@Column(name="pid")
	private int panId;
	
	@Column(name="pname")
	private String panName;
	

	private ColleageId clgId;

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="clgId_FK")
	public ColleageId getClgId() {
		return clgId;
	}

	public void setClgId(ColleageId clgId) {
		this.clgId = clgId;
	}
	@Id
	@GeneratedValue
	public int getPanId() {
		return panId;
	}

	public void setPanId(int panId) {
		this.panId = panId;
	}

	public String getPanName() {
		return panName;
	}

	public void setPanName(String panName) {
		this.panName = panName;
	}

	

	
	
}
