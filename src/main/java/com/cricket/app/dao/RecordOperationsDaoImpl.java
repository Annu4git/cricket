package com.cricket.app.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cricket.app.beans.RecordBean;
import com.cricket.app.repository.RecordRepository;

@Repository
public class RecordOperationsDaoImpl implements RecordOperationsDao {
	@Autowired
	RecordRepository recordRepo;

	
	  public RecordBean addRecord(RecordBean record) { 
		  return recordRepo.save(record); 
		  }
	 
	public RecordBean getRecord(int recordId) {
		RecordBean record = recordRepo.getById(recordId);
			System.out.println(record);
		return record;
	
	}

	@Override
	public List<RecordBean> getAllRecords() {
		return recordRepo.findAll();
	}

	public RecordBean updateRecord(RecordBean record) {
		return recordRepo.save(record);
	}

	public void deleteRecord(int recordId) {
		recordRepo.deleteById(recordId);
	}

}
