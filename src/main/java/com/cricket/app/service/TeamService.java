package com.cricket.app.service;

import java.util.List;
import java.util.Optional;

import com.cricket.app.beans.TeamBean;

public interface TeamService {
	
	public TeamBean addTeam(TeamBean team);
	public List<TeamBean> getAllTeam();
	public TeamBean updateTeam(TeamBean team);
	public TeamBean getTeam(int id);
	public String deleteTeam(int id);

}
