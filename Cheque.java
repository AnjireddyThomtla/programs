package com.mondee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cq")
public class Cheque extends Payment{
@Column(name="chequetype")
private String ChequeType;

public String getChequeType() {
	return ChequeType;
}

public void setChequeType(String chequeType) {
	ChequeType = chequeType;
}
}
