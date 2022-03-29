package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import com.cricket.app.beans.RecordBean;

public interface RecordService {
	public RecordBean addRecord(RecordBean record);
	public RecordBean getRecord(int recordId);
	public List<RecordBean> getAllRecords();
	public RecordBean updateRecord(int playerId);
	public void deleteRecord(int recordId);
	public RecordBean updateTotalRuns(int playerId,int runs);
	public RecordBean updateTotalWicket(int playerId,int wicketCount);
	public RecordBean updateTotalMatches(int playerId,int matchCount);
	public RecordBean updateTotalCatches(int playerId,int catchCount);
	public void updateMaxRuns(int playerId,int runs,int matchId);
	public void updateMaxWickets(int playerId,int wicketCount,int matchId);
	// work on get MAX wickets get max runs
}
