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

	/*
	 * @PostMapping("/add") public ResponseEntity<PlayerRecord>
	 * addRecord(@RequestBody PlayerRecord player){ return
	 * ResponseEntity.ok(recordService.addRecord(player)); }
	 * 
	 * @GetMapping("/get/{id}") public ResponseEntity<PlayerRecord>
	 * getRecord(@PathVariable int id){ return
	 * ResponseEntity.ok(recordService.getRecord(id)); }
	 */
	@GetMapping("/getAll")
	public ResponseEntity<List<PlayerRecord>> getAllRecords() {
		return ResponseEntity.ok(recordService.getAllRecords());
	}
	@PutMapping("/update/totalRuns")
	public ResponseEntity<PlayerRecord> updateTotalRuns(@RequestParam int playerId,@RequestParam int runs){
		return ResponseEntity.ok(recordService.updateTotalRuns(playerId,runs));
	}
	
	@PutMapping("/update/totalWickets")
	public ResponseEntity<PlayerRecord> updateTotalWicket(@RequestParam int playerId,@RequestParam int wicketCount){
		return ResponseEntity.ok(recordService.updateTotalWicket(playerId,wicketCount));
	}
	
	@PutMapping("/update/maxRuns")
	public void updateMaxRuns(@RequestParam int playerId,@RequestParam int runs,int matchId){
		recordService.updateMaxRuns(playerId,runs,matchId);
	}
	
	@PutMapping("/update/maxWickets")
	public void updateMaxWickets(@RequestParam int playerId,@RequestParam int wicketCount,int matchId){
		recordService.updateMaxWickets(playerId,wicketCount,matchId);
	}
	@PutMapping("/update/totalMatches")
	public ResponseEntity<PlayerRecord> updateTotalMatches(@RequestParam int playerId,@RequestParam int matchCount){
		return ResponseEntity.ok(recordService.updateTotalMatches(playerId,matchCount));
	}
	@PutMapping("/update/totalCatches")
	public ResponseEntity<PlayerRecord> updateTotalCatches(@RequestParam int playerId,@RequestParam int catchCount){
		return ResponseEntity.ok(recordService.updateTotalCatches(playerId,catchCount));
	}

	/*
	 * @PutMapping("/update/maxMatches") public ResponseEntity<PlayerRecord>
	 * updateMaxMatches(@RequestParam int playerId,@RequestParam int matchCount){
	 * return
	 * ResponseEntity.ok(recordService.updateMaxMatches(playerId,matchCount)); }
	 */
	@PutMapping("/update")
	public ResponseEntity<PlayerRecord> updateRecord(@RequestParam int playerId){
		return ResponseEntity.ok(recordService.updateRecord(playerId));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteRecord(@RequestParam int id){
		recordService.deleteRecord(id);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	
	
}



