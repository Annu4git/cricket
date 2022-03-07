package com.cricket.app.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cricket.app.beans.PlayerBean;


public interface PlayerRepository extends JpaRepository<PlayerBean, Integer>{
	

}
