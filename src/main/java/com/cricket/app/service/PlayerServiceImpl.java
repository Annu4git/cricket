package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.PlayerRecord;
import com.cricket.app.dao.PlayerOperationsDao;

@Service
public class PlayerServiceImpl implements PlayerService{
	@Autowired
	PlayerOperationsDao playerOp;
	
	@Override
	public PlayerBean addPlayer(PlayerBean player) {
		// TODO Auto-generated method stub
		return playerOp.addPlayer(player);
	}
	
	@Override
	public PlayerBean getPlayer(int id) {
		PlayerBean player = playerOp.getPlayer(id);
		return player;
	}

	@Override
	public List<PlayerBean> getAllPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlayerBean updatePlayer(PlayerBean player) {
		// TODO Auto-generated method stub
		return playerOp.updatePlayer(player);
	}

	@Override
	public String deletePlayer(int playerId) {
		// TODO Auto-generated method stub
		return playerOp.deletePlayer(playerId).toString();
		
	}

	@Override
	public PlayerRecord getRecordByPlayerId(int playerid) {
		// TODO Auto-generated method stub
		PlayerRecord record = playerOp.getPlayer(playerid).getRecord();
		System.out.println("line 53"+record);
		return record;
	}
	
}
