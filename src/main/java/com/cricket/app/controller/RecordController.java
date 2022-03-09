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

import com.cricket.app.beans.PlayerRecord;
import com.cricket.app.service.RecordService;

@RestController
@RequestMapping("/record")
public class RecordController {
	@Autowired
	RecordService recordService;

	@PostMapping("/add")
	public ResponseEntity<PlayerRecord> addRecord(@RequestBody PlayerRecord player){
		return ResponseEntity.ok(recordService.addRecord(player));
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<PlayerRecord> getRecord(@PathVariable int id){
		return ResponseEntity.ok(recordService.getRecord(id));
	}

	
	@PutMapping("/update")
	public ResponseEntity<PlayerRecord> updateRecord(@RequestBody PlayerRecord player){
		return ResponseEntity.ok(recordService.updateRecord(player));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteRecord(@RequestParam int id){
		recordService.deleteRecord(id);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	
	
}



