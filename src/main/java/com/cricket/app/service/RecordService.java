package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import com.cricket.app.beans.PlayerRecord;

public interface RecordService {
//	public PlayerRecord addRecord(PlayerRecord record);
	public List<PlayerRecord> getAllRecords();
	public PlayerRecord updateRecord(int playerId);
	public void deleteRecord(int recordId);
	public PlayerRecord updateTotalRuns(int playerId,int runs);
	public PlayerRecord updateTotalWicket(int playerId,int wicketCount);
	public PlayerRecord updateTotalMatches(int playerId,int matchCount);
	public PlayerRecord updateTotalCatches(int playerId,int catchCount);
	public void updateMaxRuns(int playerId,int runs,int matchId);
	public void updateMaxWickets(int playerId,int wicketCount,int matchId);
}
