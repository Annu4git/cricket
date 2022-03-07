package com.cricket.app.dao;

import java.util.List;
import java.util.Optional;

import com.cricket.app.beans.PlayerBean;

public interface PlayerOperationsDao {
	public PlayerBean addPlayer(PlayerBean player);
	public List<PlayerBean> getAllPlayers();
	public Optional<PlayerBean> getPlayer(int playerId);
	public PlayerBean updatePlayer(PlayerBean player);
	public void deletePlayer(int id);
}
