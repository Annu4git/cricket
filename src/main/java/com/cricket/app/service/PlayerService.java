package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import com.cricket.app.beans.PlayerBean;

public interface PlayerService {
	public PlayerBean addPlayer(PlayerBean player);
	public List<PlayerBean> getAllPlayer();
	public PlayerBean updatePlayer(PlayerBean player);
	public Optional<PlayerBean> getPlayer(int id);
	public void deletePlayer(int id);

}
