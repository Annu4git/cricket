package com.cricket.app.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="records")
public class PlayerRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	private PlayerBean player;
	private int totalRuns;
	private int totalWicket;
	private int maxRuns;
	private int maxWickets;
	private int totalCatches;
	private int totalMatches;
	private int maxMatches;
	
	public PlayerRecord() {
		// TODO Auto-generated constructor stub
	}

	public PlayerRecord(int totalRuns,PlayerBean player, int totalWicket, int maxRuns, int maxWickets, int totalCatches, int totalMatches,
			int maxMatches) {
		this.totalRuns = totalRuns;
		this.totalWicket = totalWicket;
		this.maxRuns = maxRuns;
		this.maxWickets = maxWickets;
		this.totalCatches = totalCatches;
		this.totalMatches = totalMatches;
		this.maxMatches = maxMatches;
		this.player = player;
	}
	
	

	public PlayerBean getPlayer() {
		return player;
	}

	public void setPlayer(PlayerBean player) {
		this.player = player;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getTotalWicket() {
		return totalWicket;
	}

	public void setTotalWicket(int totalWicket) {
		this.totalWicket = totalWicket;
	}

	public int getMaxRuns() {
		return maxRuns;
	}

	public void setMaxRuns(int maxRuns) {
		this.maxRuns = maxRuns;
	}

	public int getMaxWickets() {
		return maxWickets;
	}

	public void setMaxWickets(int maxWickets) {
		this.maxWickets = maxWickets;
	}

	public int getTotalCatches() {
		return totalCatches;
	}

	public void setTotalCatches(int totalCatches) {
		this.totalCatches = totalCatches;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public int getMaxMatches() {
		return maxMatches;
	}

	public void setMaxMatches(int maxMatches) {
		this.maxMatches = maxMatches;
	}
	
	
	
	
	
	

}
