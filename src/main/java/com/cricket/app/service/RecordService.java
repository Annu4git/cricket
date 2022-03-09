package com.cricket.app.service;

import java.util.Optional;

import com.cricket.app.beans.PlayerRecord;

public interface RecordService {
	public PlayerRecord addRecord(PlayerRecord record);
//	public List<PlayerRecord> getAllRecords();
	public PlayerRecord updateRecord(PlayerRecord record);
	public PlayerRecord getRecord(int playerId);
	public void deleteRecord(int id);

}
