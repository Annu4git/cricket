package com.cricket.app.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="player")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class PlayerBean {
	@Id
	@Column(name="player_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
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
	
	@JsonBackReference
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
	
	@Override
	public String toString() {
		return "PlayerBean [id=" + id + ", record_id - " + record.getId() + ", name=" + name + ", speciality=" + speciality + "]";
	}
	
	
	
	
	

}
