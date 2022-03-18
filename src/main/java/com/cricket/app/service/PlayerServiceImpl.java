package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.app.beans.PlayerBean;
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
	public Optional<PlayerBean> getPlayer(int id) {
		// TODO Auto-generated method stub
		return playerOp.getPlayer(id);
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
	
}
