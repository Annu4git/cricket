package com.cricket.app.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class PlayerBean {
	@Id
	@Column(name="player_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "record_id")
	private PlayerRecord record;
	private String name;
	private String speciality;
	
	public PlayerBean() {
		// TODO Auto-generated constructor stub
	}

	public PlayerBean(PlayerRecord record, String name, String speciality) {

		this.record = record;
		this.name = name;
		this.speciality = speciality;
	}

	public int getId() {
		return id;
	}

	public PlayerRecord getRecord() {
		return record;
	}

	public void setRecord(PlayerRecord record) {
		this.record = record;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
	
	
	
	
	

}
