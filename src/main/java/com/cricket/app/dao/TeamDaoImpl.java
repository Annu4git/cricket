package com.cricket.app.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.cricket.app.beans.TeamBean;
import com.cricket.app.repository.TeamRepository;
@Repository
public class TeamDaoImpl implements TeamDao {
	
	
	  @Autowired TeamRepository teamRepo;
	  
	  @Override public TeamBean addTeam(TeamBean team) {
	  
	  return teamRepo.save(team); 
	  }
	  
	  @Override public TeamBean getTeam(int id) {
	  
	  return teamRepo.getById(id); //find by Id can also be used
	  
	  }
	 
}
