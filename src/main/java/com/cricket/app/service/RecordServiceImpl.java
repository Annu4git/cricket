package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.RecordBean;
import com.cricket.app.dao.PlayerOperationsDao;
import com.cricket.app.dao.RecordOperationsDao;

@Service
public class RecordServiceImpl implements RecordService{
	@Autowired
	RecordOperationsDao recordOp;
	@Autowired
	PlayerOperationsDao playerOp;
	
	public RecordBean addRecord(RecordBean record)
	{
		return recordOp.addRecord(record);
	}
	
	public List<RecordBean> getAllRecords()
	{
		return recordOp.getAllRecords();
	}

	
	@Override
	public RecordBean updateRecord(int playerId) {
		// TODO Auto-generated method stub
		return recordOp.updateRecord(playerOp.getPlayer(playerId).getRecord());
	}

	@Override
	public void deleteRecord(int playerId) {
		// TODO Auto-generated method stub
		recordOp.deleteRecord(playerId);
	}

	@Override
	public RecordBean updateTotalRuns(int playerId, int runs) {
		RecordBean record = playerOp.getPlayer(playerId).getRecord();
		record.setTotalRuns(record.getTotalRuns()+runs);
		return recordOp.updateRecord(record);
		
	}

	@Override
	public RecordBean updateTotalWicket(int playerId, int wicketCount) {
		RecordBean record = playerOp.getPlayer(playerId).getRecord();
		record.setTotalWicket(record.getTotalWicket()+wicketCount);
		return recordOp.updateRecord(record);
	}

	@Override
	public RecordBean updateTotalMatches(int playerId, int matchCount) {
		RecordBean record = playerOp.getPlayer(playerId).getRecord();
		record.setTotalMatches(record.getTotalMatches()+matchCount);
		return recordOp.updateRecord(record);
	}

	@Override
	public RecordBean updateTotalCatches(int playerId, int catchCount) {
		RecordBean record = playerOp.getPlayer(playerId).getRecord();
		record.setTotalCatches(record.getTotalCatches()+catchCount);
		return recordOp.updateRecord(record);
	}
	
	@Override
	public void updateMaxRuns(int playerId, int runs, int matchId) {
		RecordBean record = playerOp.getPlayer(playerId).getRecord();
		if(record.getMaxRuns()<runs) {
		record.setMaxWickets(runs);
		record.setMatchIdForMaxRuns(matchId);
		recordOp.updateRecord(record);
		}
		
	}
	
	@Override
	public void updateMaxWickets(int playerId, int wicketCount, int matchId) {
		RecordBean record = playerOp.getPlayer(playerId).getRecord();
		if(record.getMaxWickets()<wicketCount) {
			record.setMaxWickets(wicketCount);
			record.setMatchIdForMaxWickets(matchId);
			recordOp.updateRecord(record);
		} 
	}
	/*
	 * @Override public PlayerRecord updateMaxMatches(int playerId, int matchCount)
	 * { PlayerRecord record = playerOp.getRecordByPlayerId(playerId);
	 * record.se(record.getMaxMatches()+matchCount); return
	 * recordOp.updateRecord(record); }
	 */


	@Override
	public RecordBean getRecord(int recordId) {
		// TODO Auto-generated method stub
		return recordOp.getRecord(recordId);
	}
	
	
	
}
