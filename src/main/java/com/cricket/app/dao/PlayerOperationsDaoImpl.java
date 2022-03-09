package com.cricket.app.dao;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.PlayerRecord;

@Repository
@Transactional
public class PlayerOperationsDaoImpl implements PlayerOperationsDao{
	@Autowired
	PlayerRepository playerRepo;
	@Autowired
	RecordOperationsDao recordDao;
	
	public PlayerBean addPlayer(PlayerBean player) {
		PlayerRecord record = new PlayerRecord(0, player, 0, 0, 0, 0, 0, 0);
		recordDao.addRecord(record);
		return playerRepo.save(player);
	}
	
	public List<PlayerBean> getAllPlayers() {
		return playerRepo.findAll();
	}
	
	public Optional<PlayerBean> getPlayer(int id){
		return playerRepo.findById(id);
	}
	
	public PlayerBean updatePlayer(PlayerBean player){
		return playerRepo.save(player);
	}
	
	public void deletePlayer(int id) {
		playerRepo.deleteById(id);
	}
	

}
