package com.cricket.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cricket.app.beans.PlayerRecord;


public interface RecordRepository extends JpaRepository<PlayerRecord, Integer> {
	@Query("select r from PlayerRecord r where r.player.id = ?1")
	public PlayerRecord getRecord(int playerId);
}



