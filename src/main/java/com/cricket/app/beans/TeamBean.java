package com.cricket.app.beans;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "team")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class TeamBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="team_id")
	private int id;
	
	private String name;
//	@Column(name="create_dt")
//	private Date date;
	
	@JsonIgnoreProperties("team")
    @OneToMany(mappedBy="team",cascade = {CascadeType.MERGE, CascadeType.REFRESH,CascadeType.DETACH })
	private List<PlayerBean> players;
	
	public TeamBean() {
		// TODO Auto-generated constructor stub
	}


	public TeamBean(String name, List<PlayerBean> players) {
		super();
		this.name = name;
		this.players = players;
	}


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

	
	public List<PlayerBean> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerBean> players) {
		this.players = players;
	}
	
	// add a convenience method
	public void addPlayer(PlayerBean player)
	{
		if(players == null)
			players = new ArrayList<>();
		
		players.add(player);
	}

//	@Override
//	public String toString() {
//		return "TeamBean [id=" + id + ", name=" + name + ", players=" + players + "]";
//	}
	
	

}
