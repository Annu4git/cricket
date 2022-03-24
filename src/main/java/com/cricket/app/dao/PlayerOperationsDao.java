package com.cricket.app.dao;

import java.util.List;
import java.util.Optional;

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.PlayerRecord;
import com.cricket.app.utils.MessageStatus;

public interface PlayerOperationsDao {
	public PlayerBean addPlayer(PlayerBean player);
	public List<PlayerBean> getAllPlayers();
	public PlayerBean getPlayer(int playerId);
	public PlayerBean updatePlayer(PlayerBean player);
	public MessageStatus deletePlayer(int id);
}
