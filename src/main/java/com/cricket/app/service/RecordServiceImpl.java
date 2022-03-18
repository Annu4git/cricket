package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.PlayerRecord;
import com.cricket.app.dao.PlayerOperationsDao;
import com.cricket.app.dao.RecordOperationsDao;

@Service
public class RecordServiceImpl implements RecordService{
	@Autowired
	RecordOperationsDao recordOp;
	@Autowired
	PlayerOperationsDao playerOp;
	
	public List<PlayerRecord> getAllRecords()
	{
		return recordOp.getAllRecords();
	}

	
	@Override
	public PlayerRecord updateRecord(int playerId) {
		// TODO Auto-generated method stub
		return recordOp.updateRecord(playerOp.getRecordByPlayerId(playerId));
	}

	@Override
	public void deleteRecord(int playerId) {
		// TODO Auto-generated method stub
		recordOp.deleteRecord(playerId);
	}

	@Override
	public PlayerRecord updateTotalRuns(int playerId, int runs) {
		PlayerRecord record = playerOp.getRecordByPlayerId(playerId);
		record.setTotalRuns(record.getTotalRuns()+runs);
		return recordOp.updateRecord(record);
		
	}

	@Override
	public PlayerRecord updateTotalWicket(int playerId, int wicketCount) {
		PlayerRecord record = playerOp.getRecordByPlayerId(playerId);
		record.setTotalWicket(record.getTotalWicket()+wicketCount);
		return recordOp.updateRecord(record);
	}

	@Override
	public PlayerRecord updateTotalMatches(int playerId, int matchCount) {
		PlayerRecord record = playerOp.getRecordByPlayerId(playerId);
		record.setTotalMatches(record.getTotalMatches()+matchCount);
		return recordOp.updateRecord(record);
	}

	@Override
	public PlayerRecord updateTotalCatches(int playerId, int catchCount) {
		PlayerRecord record = playerOp.getRecordByPlayerId(playerId);
		record.setTotalCatches(record.getTotalCatches()+catchCount);
		return recordOp.updateRecord(record);
	}
	
	@Override
	public void updateMaxRuns(int playerId, int runs, int matchId) {
		PlayerRecord record = playerOp.getRecordByPlayerId(playerId);
		if(record.getMaxRuns()<runs) {
		record.setMaxWickets(runs);
		record.setMatchIdForMaxRuns(matchId);
		recordOp.updateRecord(record);
		}
		
	}
	
	@Override
	public void updateMaxWickets(int playerId, int wicketCount, int matchId) {
		PlayerRecord record = playerOp.getRecordByPlayerId(playerId);
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
	
	
	
}
