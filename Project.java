package com.mondee;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name="project")
public class Project {
	
@Id
@GeneratedValue
@Column(name="pid")
private int proId;

@Column(name="pname")
private String proName;

private ArrayList<SoftEmployee> semp=new ArrayList<SoftEmployee>();

public int getProId() {
	return proId;
}

public void setProId(int proId) {
	this.proId = proId;
}

public String getProName() {
	return proName;
}

public void setProName(String proName) {
	this.proName = proName;
}
@ManyToMany
@JoinTable(name="Join_Project_SoftEmployee",
joinColumns= {@JoinColumn(name="proId")},
inverseJoinColumns= {@JoinColumn(name="sofId")})

public ArrayList<SoftEmployee> getSemp() {
	return semp;
}

public void setSemp(ArrayList<SoftEmployee> semp) {
	this.semp = semp;
}

}
