package com.cricket.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cricket.app.beans.RecordBean;


public interface RecordRepository extends JpaRepository<RecordBean, Integer> {
//	@Query("select r from PlayerRecord r where r.id = ?1")
//	public RecordBean getRecord(int recordId);
}



