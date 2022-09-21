package com.bugtrack2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberEntities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long memberID;
	private String fName;
	private String lName;
	
	public MemberEntities() {
		
	}
	
	public MemberEntities(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	
	public Long getMemberID() {
		return memberID;
	}
	public void setMemberID(Long memberID) {
		this.memberID = memberID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
		
}
