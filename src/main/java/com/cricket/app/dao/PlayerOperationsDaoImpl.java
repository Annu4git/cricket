package com.cricket.app.dao;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.PlayerRecord;
import com.cricket.app.repository.PlayerRepository;
import com.cricket.app.utils.MessageStatus;

@Repository
public class PlayerOperationsDaoImpl implements PlayerOperationsDao{
	@Autowired
	PlayerRepository playerRepo;
	
	public PlayerBean addPlayer(PlayerBean player) {
		PlayerRecord record = new PlayerRecord(0, 0, 0, 0, 0, 0, 0, 0, 0, 0,player.getName());
		 player.setRecord(record);
		return playerRepo.save(player);
	}
	
	public List<PlayerBean> getAllPlayers() {
		return playerRepo.findAll();
	}
	
	public Optional<PlayerBean> getPlayer(int id){
		return playerRepo.findById(id);
	}
	
	public PlayerRecord getRecordByPlayerId(int playerId){
		
		if(getPlayer(playerId).isPresent())
			 return getPlayer(playerId).get().getRecord();
		
		return null;
		
	}
	
	public PlayerBean updatePlayer(PlayerBean player){
		return playerRepo.save(player);
	}
	
	public MessageStatus deletePlayer(int id) {
		MessageStatus result = null;
		try
		{
			playerRepo.deleteById(id);
			result = MessageStatus.Player_Deleted;
		}
		catch(Exception e)
		{
			result = MessageStatus.Player_Not_Found;
		}
		return result;
	}
	

}
