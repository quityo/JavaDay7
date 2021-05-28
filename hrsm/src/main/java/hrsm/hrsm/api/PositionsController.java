package hrsm.hrsm.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrsm.hrsm.business.Abstracts.PositionService;
import hrsm.hrsm.core.utitilies.results.DataResult;
import hrsm.hrsm.core.utitilies.results.Result;
import hrsm.hrsm.entities.Concretes.Position;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {
	
	private PositionService positionService;
	
	@Autowired
	public PositionsController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Position>> getAll(){
		return this.positionService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Position position) {
		return this.positionService.add(position);
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody Position position) {
		return this.positionService.delete(position);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Position position) {
		return this.positionService.update(position);
	}

}
