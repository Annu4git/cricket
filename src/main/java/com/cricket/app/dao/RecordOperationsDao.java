package com.cricket.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.app.beans.RecordBean;

public interface RecordOperationsDao  {
	public RecordBean addRecord(RecordBean record);
	public RecordBean getRecord(int recordId);
	public List<RecordBean> getAllRecords();
	public RecordBean updateRecord(RecordBean record);
	public void deleteRecord(int playerId);
}
