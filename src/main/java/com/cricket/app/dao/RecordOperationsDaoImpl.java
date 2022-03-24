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
public class RecordOperationsDaoImpl implements RecordOperationsDao {
	@Autowired
	RecordRepository recordRepo;

	/*
	 * public PlayerRecord addRecord(PlayerRecord record) { return
	 * recordRepo.save(record); }
	 */
	public PlayerRecord getRecord(int recordId) {
		Optional<PlayerRecord> record = recordRepo.findById(recordId);
		if(record.isPresent()) {
			System.out.println(record);
			System.out.println(record.get());
		return record.get();
		}
		return null;
	}

	@Override
	public List<PlayerRecord> getAllRecords() {
		return recordRepo.findAll();
	}

	public PlayerRecord updateRecord(PlayerRecord record) {
		return recordRepo.save(record);
	}

	public void deleteRecord(int recordId) {
		recordRepo.deleteById(recordId);
	}

}
