package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.PlayerRecord;

public interface PlayerService {
	public PlayerBean addPlayer(PlayerBean player);
	public List<PlayerBean> getAllPlayer();
	public PlayerBean updatePlayer(PlayerBean player);
	public PlayerBean getPlayer(int id);
	public String deletePlayer(int id);
	public PlayerRecord getRecordByPlayerId(int playerid);

}
