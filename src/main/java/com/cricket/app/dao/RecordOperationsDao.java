package com.cricket.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.app.beans.PlayerRecord;

public interface RecordOperationsDao  {
	public PlayerRecord addRecord(PlayerRecord record);
	public PlayerRecord getRecord(int recordId);
	public List<PlayerRecord> getAllRecords();
	public PlayerRecord updateRecord(PlayerRecord record);
	public void deleteRecord(int playerId);
}
