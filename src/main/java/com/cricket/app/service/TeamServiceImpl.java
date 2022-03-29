package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.TeamBean;
import com.cricket.app.dao.TeamDao;
@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	TeamDao teamDao;
	
	@Autowired
	PlayerService playerService;
	
	@Override
	public TeamBean addTeam(TeamBean team) {
		TeamBean newTeam = new TeamBean();
		newTeam.setName(team.getName());
		TeamBean addedTeam = teamDao.addTeam(newTeam);
		System.out.println("xxxxxxxxxxxxxxxxx"+addedTeam.getId());
		newTeam.setId(addedTeam.getId());
		for(PlayerBean player: team.getPlayers()) {
			PlayerBean currPlayer = playerService.getPlayer(player.getId());
			currPlayer.setTeam(newTeam);
		}
		newTeam.setPlayers(team.getPlayers());
		
		return teamDao.addTeam(newTeam);
		
	}

	@Override
	public List<TeamBean> getAllTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamBean updateTeam(TeamBean team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamBean getTeam(int id) {
	
//		return teamDao.getTeam(id);
		return null;
	}

	@Override
	public String deleteTeam(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
