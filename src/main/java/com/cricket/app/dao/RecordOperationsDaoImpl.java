package com.cricket.app.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cricket.app.beans.PlayerRecord;
import com.cricket.app.repository.RecordRepository;

@Repository
@Transactional
public class RecordOperationsDaoImpl implements RecordOperationsDao{
	@Autowired
	RecordRepository recordRepo;
	
	public PlayerRecord addRecord(PlayerRecord record) {
		return recordRepo.save(record);
	}
	
	public PlayerRecord getRecord(int playerId){
	
		return recordRepo.getRecord(playerId);
	}
	
	public PlayerRecord updateRecord(PlayerRecord record){
		return recordRepo.save(record);
	}
	
	public void deleteRecord(int playerId) {
		recordRepo.deleteById(playerId);
	}

	

}
