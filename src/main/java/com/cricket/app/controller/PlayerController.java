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

import com.cricket.app.beans.PlayerBean;
import com.cricket.app.beans.PlayerRecord;
import com.cricket.app.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
	PlayerService playerService;

	@PostMapping("/add")
	public ResponseEntity<PlayerBean> addPlayer(@RequestBody PlayerBean player){
		return ResponseEntity.ok(playerService.addPlayer(player));
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<PlayerBean> getPlayer(@PathVariable int id){
		return ResponseEntity.ok(playerService.getPlayer(id));
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<PlayerBean>> getAllPlayer(){
		return ResponseEntity.ok(playerService.getAllPlayer());
	}
	
	@PutMapping("/update")
	public ResponseEntity<PlayerBean> updatePlayer(@RequestBody PlayerBean player){
		return ResponseEntity.ok(playerService.updatePlayer(player));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deletePlayer(@RequestParam int id){
		return ResponseEntity.ok(playerService.deletePlayer(id));
//		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	 @GetMapping("/getRecord/{id}") 
	 public ResponseEntity<PlayerRecord> getRecord(@PathVariable int id){ 
		 PlayerRecord record = playerService.getRecordByPlayerId(id);
		 return ResponseEntity.ok(record); 
		 }
	
	
	
}



