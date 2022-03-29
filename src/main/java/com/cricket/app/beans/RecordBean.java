package com.cricket.app.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="records")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RecordBean {

	@Id
	@Column(name = "record_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JsonIgnoreProperties("record")
	@OneToOne(mappedBy = "record", cascade = CascadeType.ALL,fetch = FetchType.LAZY)  // record is the name of Java class property(player class) not a table column
	private PlayerBean player;   // to make OneToOne relation Bi-directional
	private int totalRuns;
	private int totalWicket;
	private int totalCatches;
	private int totalMatches;
//	private int total50s;
//	private int total100s;
	private int maxRuns;
	private int maxWickets;
	private int maxCatches;
	private int matchIdForMaxRuns;
	private int matchIdForMaxWickets;
	private int matchIdForMaxCatches;
	
	public RecordBean() {
		// TODO Auto-generated constructor stub
	}

	public RecordBean(int totalRuns, int totalWicket, int totalCatches, int totalMatches, int maxRuns, int maxWickets,
			int maxCatches, int matchIdForMaxRuns, int matchIdForMaxWickets, int matchIdForMaxCatches,PlayerBean player) {
		this.totalRuns = totalRuns;
		this.totalWicket = totalWicket;
		this.totalCatches = totalCatches;
		this.totalMatches = totalMatches;
		this.maxRuns = maxRuns;
		this.maxWickets = maxWickets;
		this.maxCatches = maxCatches;
		this.matchIdForMaxRuns = matchIdForMaxRuns;
		this.matchIdForMaxWickets = matchIdForMaxWickets;
		this.matchIdForMaxCatches = matchIdForMaxCatches;
		this.player = player;
	}

	
//	@JsonManagedReference
	public PlayerBean getPlayer() {
		return player;
	}

	public void setPlayer(PlayerBean player) {
		this.player  = player;
	}

	public int getId()
	{
		return id;
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

	public int getMaxCatches() {
		return maxCatches;
	}

	public void setMaxCatches(int maxCatches) {
		this.maxCatches = maxCatches;
	}

	public int getMatchIdForMaxRuns() {
		return matchIdForMaxRuns;
	}

	public void setMatchIdForMaxRuns(int matchIdForMaxRuns) {
		this.matchIdForMaxRuns = matchIdForMaxRuns;
	}

	public int getMatchIdForMaxWickets() {
		return matchIdForMaxWickets;
	}

	public void setMatchIdForMaxWickets(int matchIdForMaxWickets) {
		this.matchIdForMaxWickets = matchIdForMaxWickets;
	}

	public int getMatchIdForMaxCatches() {
		return matchIdForMaxCatches;
	}

	public void setMatchIdForMaxCatches(int matchIdForMaxCatches) {
		this.matchIdForMaxCatches = matchIdForMaxCatches;
	}
	
	
	@Override
	public String toString() {
		return "PlayerRecord [id=" + id + ", player = " + player.getName() + ", totalRuns=" + totalRuns + ", totalWicket="
				+ totalWicket + ", totalCatches=" + totalCatches + ", totalMatches=" + totalMatches + ", maxRuns="
				+ maxRuns + ", maxWickets=" + maxWickets + ", maxCatches=" + maxCatches + ", matchIdForMaxRuns="
				+ matchIdForMaxRuns + ", matchIdForMaxWickets=" + matchIdForMaxWickets + ", matchIdForMaxCatches="
				+ matchIdForMaxCatches + "]";
	}
	
	
	
	
	
	

}
