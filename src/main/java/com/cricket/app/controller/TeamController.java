package com.cricket.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.app.beans.TeamBean;
import com.cricket.app.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {
	@Autowired
	TeamService teamService;

	@PostMapping("/create")
	public ResponseEntity<TeamBean> addTeam(@RequestBody TeamBean Team){
		return ResponseEntity.ok(teamService.addTeam(Team));
	}
	
	@GetMapping("/get")
	public ResponseEntity<TeamBean> getTeam(@RequestParam int id){
		return ResponseEntity.ok(teamService.getTeam(id));
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<TeamBean>> getAllTeam(){
		return ResponseEntity.ok(teamService.getAllTeam());
	}
	
	@PutMapping("/update")
	public ResponseEntity<TeamBean> updateTeam(@RequestBody TeamBean Team){
		return ResponseEntity.ok(teamService.updateTeam(Team));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteTeam(@RequestParam int id){
		return ResponseEntity.ok(teamService.deleteTeam(id));
//		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	
	
}



