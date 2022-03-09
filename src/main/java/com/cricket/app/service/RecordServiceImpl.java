package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.app.beans.PlayerRecord;
import com.cricket.app.dao.RecordOperationsDao;

@Service
public class RecordServiceImpl implements RecordService{
	@Autowired
	RecordOperationsDao recordOp;
	
	@Override
	public PlayerRecord addRecord(PlayerRecord record) {
		// TODO Auto-generated method stub
		return recordOp.addRecord(record);
	}
	
	@Override
	public PlayerRecord getRecord(int playerId) {
		// TODO Auto-generated method stub
		return recordOp.getRecord(playerId);
	}


	@Override
	public PlayerRecord updateRecord(PlayerRecord record) {
		// TODO Auto-generated method stub
		return recordOp.updateRecord(record);
	}

	@Override
	public void deleteRecord(int playerId) {
		// TODO Auto-generated method stub
		recordOp.deleteRecord(playerId);
		
	}
	
}
