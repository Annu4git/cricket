package com.cricket.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.PlayerRecord;


public interface PlayerRepository extends JpaRepository<PlayerBean, Integer>{
	
}
