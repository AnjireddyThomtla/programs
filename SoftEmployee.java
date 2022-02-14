package com.mondee;

import java.util.ArrayList;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity
@Table(name="softemployee")
public class SoftEmployee {
	private int sofempId;
	private String sofName;
	private ArrayList<Project> pro=new ArrayList<Project> ();
	
	@Id
	@GeneratedValue
	
	public int getSofempId() {
		return sofempId;
	}
	public void setSofempId(int sofempId) {
		this.sofempId = sofempId;
	}
	public String getSofName() {
		return sofName;
	}
	public void setSofName(String sofName) {
		this.sofName = sofName;
	}
	
	@ManyToMany
	@JoinTable(name="JOIN_PROJECT_SOFTEMPLOYEE",
	joinColumns={@JoinColumn(name="sofempId")},
	inverseJoinColumns= {@JoinColumn(name="proId")})

	public ArrayList<Project> getPro() {
		return pro;
	}
	public void setPro(ArrayList<Project> pro) {
		this.pro = pro;
	}
	
	
	
	
}
