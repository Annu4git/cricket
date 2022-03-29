package com.cricket.app.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@JsonIgnoreProperties("player")
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "record_id")
	private RecordBean record;
	private String name;
	private String speciality;
	
	@JsonIgnoreProperties("player")
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH,CascadeType.DETACH })
	@JoinColumn(name = "team_id")
	private TeamBean team;
	public PlayerBean() {
		// TODO Auto-generated constructor stub
	}


	public PlayerBean(RecordBean record, String name, String speciality, TeamBean team) {
		super();
		this.record = record;
		this.name = name;
		this.speciality = speciality;
		this.team = team;
	}



	public int getId() {
		return id;
	}
	
//	@JsonBackReference
	public RecordBean getRecord() {
		return record;
	}

	public void setRecord(RecordBean record) {
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

	public TeamBean getTeam() {
		return team;
	}


	public void setTeam(TeamBean team) {
		this.team = team;
	}
	
	
	
	
	
	
	

}
